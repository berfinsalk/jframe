import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class ders9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("coklu yapilar");
		frame.setSize(500,500);
		
		JPanel GUI=new JPanel();
		GUI.setLayout(null);
		frame.add(GUI); // 
		
		
		JPanel sol=new JPanel();
		sol.setSize(250,500);
		sol.setLocation(0, 0);
		sol.setLayout(null);
		
		JPanel saÄŸ=new JPanel();
		saÄŸ.setSize(250,500);
		saÄŸ.setLocation(250, 0);
		saÄŸ.setLayout(null);
		
		JLabel lbl_sayi1=new JLabel("maliyet ");
		lbl_sayi1.setSize(250,30);
		lbl_sayi1.setLocation(0,0);
		lbl_sayi1.setFont(lbl_sayi1.getFont().deriveFont(20.0f));
		
		JLabel lbl_sayi2=new JLabel("ürün ");
		lbl_sayi2.setSize(250,30);
		lbl_sayi2.setLocation(0,40);
		lbl_sayi2.setFont(lbl_sayi2.getFont().deriveFont(20.0f));
		
		JLabel fiyat =new JLabel("fiyat");		
		fiyat.setSize(100,30);
		fiyat.setLocation(150,80);
		fiyat.setFont(fiyat.getFont().deriveFont(20.0f));
		
		JLabel cinsiyet =new JLabel("cinsiyet");		
		cinsiyet.setSize(100,30);
		cinsiyet.setLocation(150,120);
		cinsiyet.setFont(cinsiyet.getFont().deriveFont(20.0f));
		
		JTextField txt1=new JTextField();
		txt1.setSize(250,30);
		txt1.setLocation(0,0);
		txt1.setFont(txt1.getFont().deriveFont(20.0f));
			
		String [] urunler= {"seçiniz: ","T-shirt","Gömlek","Pantolon"};	//combobox içine ürün ekleme
		JComboBox urun =new JComboBox(urunler);		//combobox içine ürünler dizisini yerleştirdik.
		urun.setSize(250,30);
		urun.setLocation(0,80);
		urun.setFont(urun.getFont().deriveFont(20.0f));
		
		urun.addActionListener(new ActionListener(){ 	//urun adlı combobox'a tıklandığında 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(urun.getSelectedItem()=="T-shirt") {	
					txt1.setText("T-shirt");
				}
				else if(urun.getSelectedItem()=="Gömlek") {
					txt1.setText("Gömlek");
				}
				else if(urun.getSelectedItem()=="Pantolon") {
					txt1.setText("Pantolon");
				}
				
			}
		});
		
		JCheckBox indirim =new JCheckBox("%20 indirim");
		indirim.setSize(250,30);
		indirim.setLocation(0,140);
		indirim.setFont(indirim.getFont().deriveFont(20.0f));
		
		indirim.addActionListener(new ActionListener(){ 	//indirim adlı CheckBox'a tıklandığında 
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(indirim.isSelected()) {	//fiyatın yazıldığı textbox seçiliyse %20 indirimli halini fiyat adlı labela yaz
					double sonfiyat= Integer.parseInt(txt1.getText())-Integer.parseInt(txt1.getText())*20/100;
					fiyat.setText(Double.toString(sonfiyat));
					
				}
				else		// seçili değilse fiyatın eski halini yaz
				{
					fiyat.setText(txt1.getText());
				}
			}
		});
		
		JRadioButton erkek =new JRadioButton("erkek");
		erkek.setSize(250,30);
		erkek.setLocation(0,200);
		erkek.setFont(erkek.getFont().deriveFont(20.0f));
		
		JRadioButton kadin =new JRadioButton("kadin");
		kadin.setSize(250,240);
		kadin.setLocation(0,150);
		kadin.setFont(kadin.getFont().deriveFont(20.0f));
		
		ButtonGroup bg=new ButtonGroup();	// radiobutton'ları grup içine almalıyız ki erkek seçiliyken
											//kadın seçili olmasın
		bg.add(kadin);
		bg.add(erkek);
		
		erkek.addActionListener(new ActionListener(){ 	//erkek radiobutton'u seçildiğinde
			@Override
			public void actionPerformed(ActionEvent e) {	//cinsiyet labelına erkek yazılsın
				cinsiyet.setText(erkek.getText());
			}
		});
		
		kadin.addActionListener(new ActionListener(){ 	//kadin radiobutton'u seçildiğinde
			@Override
			public void actionPerformed(ActionEvent e) {	//cinsiyet label'ına kadın yazılsın
				cinsiyet.setText(kadin.getText());
			}
		});
		GUI.add(saÄŸ);
		GUI.add(sol);
		sol.add(lbl_sayi1);
		sol.add(lbl_sayi2);		
		sol.add(urun);
		sol.add(indirim);
		sol.add(erkek);
		sol.add(kadin);
		saÄŸ.add(txt1);
		saÄŸ.add(fiyat);
		saÄŸ.add(cinsiyet);
		frame.setVisible(true);
	}




	}


