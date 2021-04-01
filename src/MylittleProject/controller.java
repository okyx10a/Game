package MylittleProject;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.*;




public class controller implements ActionListener{
	 public static final String START = "START";
	 public static final String CONFIRM = "CONFIRM";
	 private Model model;
	 private View view;
	 private int win,loose;
	 
	 public controller() {
		 win = loose =0;
	 }
	 
	 public void setModel(Model model) {
		    this.model = model;
	 }
	 
	 public void setView(View view) {
		    this.view = view;
	 }
	@Override
	 public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == START){
			view.remove(view.btnStartGame);
			view.remove(view.lblRandomGuesser);
			view.add(view.btnConfirm);
			view.add(view.result);
			view.add(view.textField);
			view.add(view.promptUser);
			view.add(view.resultLabel);
			view.repaint();
		}
		else if(e.getActionCommand() == CONFIRM){
			
			
			if(model.play(view.textField.getText()).equals("true")){
				win++;
				loose=0;
				switch(win){
				case 1:
				    view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/win1.png")));
				    break;
				default:
					view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/win2.png")));
				    break;	
				}
				view.resultLabel.setText("The correct number is "+((Integer)model.correctNumber).toString());
			}else if(model.play(view.textField.getText()).equals("false")){
				loose++;
				win=0;
				switch(loose){
				case 1:
				    view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/loose1.gif")));
				    break;
				case 2:
					view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/loose2.gif")));
				    break;
				case 3:
					view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/loose3.gif")));
				    break;
				case 4:
					view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/loose4.gif")));
				    break;
				case 5:
					view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/loose5.gif")));
				    break;
				default:
					view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/loose6.gif")));
				    break;
				}
				view.resultLabel.setText("The correct number is "+((Integer)model.correctNumber).toString());
				
			}else if(model.play(view.textField.getText())=="error")
				{
				view.resultLabel.setText("Number 0-10! Ya DumDum!");
				view.result.setIcon(new ImageIcon(View.class.getResource("/MylittleProject/error.png")));
			}
			
			
		}
		
	}
	 
	 

}
