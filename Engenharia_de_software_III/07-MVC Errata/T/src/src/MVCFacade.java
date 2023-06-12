package src;

public class MVCFacade {
    private Model model;
    private View view;
    private Controller controller;

    public MVCFacade() {
        model = Model.getInstance();
        view = new View();
        controller = new Controller(model, view);
    }

    public void start() {
        controller.start();
    }

	public void start1() {
		// TODO Auto-generated method stub
		
	}

	public void start11() {
		// TODO Auto-generated method stub
		
	}
}