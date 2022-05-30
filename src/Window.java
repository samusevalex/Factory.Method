public abstract class Window {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.renderButton();
    }
    public abstract Button createButton();
}
