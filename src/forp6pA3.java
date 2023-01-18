 class Computer {
    private String processor;
    private String graphicCard;
    private String motherBoardModel;
    private int price;

    public Computer(String processor, String graphicCard, String motherBoardModel, int price) {
        this.setProcessor(processor);
        this.setGraphicCard(graphicCard);
        this.setMotherBoardModel(motherBoardModel);
        this.setPrice(price);
    }

     public String getProcessor() {
         return processor;
     }

     public void setProcessor(String processor) {
         this.processor = processor;
     }

     public String getGraphicCard() {
         return graphicCard;
     }

     public void setGraphicCard(String graphicCard) {
         this.graphicCard = graphicCard;
     }

     public String getMotherBoardModel() {
         return motherBoardModel;
     }

     public void setMotherBoardModel(String motherBoardModel) {
         this.motherBoardModel = motherBoardModel;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     // Write your code here

}