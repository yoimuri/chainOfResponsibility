package chainOfResponsibility;

public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();
        
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
        
        WasteContainer fullOrganicWaste = new WasteContainer("organic", 60, true);
        WasteContainer emptyRecyclableWaste = new WasteContainer("recyclable", 40, false);
        WasteContainer fullHazardousWaste = new WasteContainer("hazardous", 15, true);
        WasteContainer unknownWaste = new WasteContainer("medical", 25, true);
        
        organicCollector.collectWaste(fullOrganicWaste);
        organicCollector.collectWaste(emptyRecyclableWaste);
        organicCollector.collectWaste(fullHazardousWaste);
        organicCollector.collectWaste(unknownWaste);
    }
}

