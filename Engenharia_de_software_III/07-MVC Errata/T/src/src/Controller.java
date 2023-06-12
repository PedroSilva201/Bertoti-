package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.text.View;

import src.Controller.AddNameListener;

public class Controller {
    private Model model;
    private src.View view;

    public Controller(Model model, src.View view2) {
        this.model = model;
        this.view = view2;

        ((src.View) view2).addNameListener(new AddNameListener());
        model.setAddNameStrategy(new NormalAddNameStrategy());
    }

    public void Controller1(Model model2, src.View view2) {
		// TODO Auto-generated constructor stub
	}

	public void start() {
        List<String> names = model.getNames();
        ((src.View) view).displayNames(names);
    }

    class AddNameListener implements ActionListener {
        public void actionPerformed1(ActionEvent e) {
            String name = ((src.View) view).getNameInput();
            model.addName(name);
            ((src.View) view).clearNameInput();

            List<String> names = model.getNames();
            ((src.View) view).displayNames(names);
        }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
    }
}