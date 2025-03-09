package chainOfResponsibility;

class HazardousWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println("Hazardous waste collected and safely disposed of.");
        } else {
            super.collectWaste(container);
        }
    }
}