public class App {
    private Queue<String> myQueue;

    public App(){
        myQueue = new Queue<>();
    }

    public void submitPrintRequest(String document){
        myQueue.enqueue(document);
        System.out.println("Print request Submitted "+ document);
    }
    
    public void processPrintRequest(){
        while(!myQueue.isEmpty()){
            String document = myQueue.dequeue();
            System.out.println("Printing Document: "+ document);
        }
        System.out.println("All print request are processed");
    }

    public static void main(String[] args) {
        App printService = new App();

        printService.submitPrintRequest("Document 1");
        printService.submitPrintRequest("Document 2");
        printService.submitPrintRequest("Document 3");

        printService.processPrintRequest();
    }
}