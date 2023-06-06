package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Model.Model;
import View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addNameListener(new AddNameListener());
    }

    public void Controller1(Model model, View view) {
		// TODO Auto-generated constructor stub
	}

	public void start() {
        List<String> names = model.getNames();
        view.displayNames(names);
    }

    class AddNameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getNameInput();
            model.addName(name);
            view.clearNameInput();

            List<String> names = model.getNames();
            view.displayNames(names);
        }
    }
}
