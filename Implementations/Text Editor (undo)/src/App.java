public class App {
    private StringBuilder document;
    private Stack<Integer> undoStack;

    public App(){
        this.document = new StringBuilder();
        this.undoStack = new Stack<>();
    }

    public void insert(String text){
        document.append(text);
        undoStack.push(text.length());
    }

    public void undo(){
        if(!undoStack.isEmpty()){
            int length = undoStack.pop();
            document.delete(document.length() - length, document.length());
        }
    }

    public void printDocument(){
        System.out.println(document);
    }

    public static void main(String[] args) {
        App TextEditor = new App();
        TextEditor.insert("Hello ");
        TextEditor.insert("Java");
        TextEditor.printDocument();
        TextEditor.undo();
        TextEditor.printDocument();
        TextEditor.insert("World!");
        TextEditor.printDocument();
    }
}
