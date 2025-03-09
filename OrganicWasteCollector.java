package chainOfResponsibility;

class OrganicWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic") && container.isFull()) {
            System.out.println("Organic waste collected and disposed of.");
        } else {
            super.collectWaste(container);
        }
    }
}
