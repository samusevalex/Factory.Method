public class HtmlWindow extends Window {
    @Override
    public Button createButton(){
        return new HtmlButton();
    }
}
