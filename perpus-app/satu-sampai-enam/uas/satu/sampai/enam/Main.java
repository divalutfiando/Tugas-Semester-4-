package uas.satu.sampai.enam;

import java.net.URL;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Users{
	private Integer NIK;
	private String Fullname;
	private String Address;
	
	public Integer getNIK() {
		return NIK;
	}
	public void setNIK(Integer nik) {
		NIK = nik;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}	
}

class Profile extends Users{
	private String Avatar;

	public String getAvatar() {
		return Avatar;
	}
	
	public Image fetchingAvatar() throws IOException {
		URL url = new URL("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/e/e0/"
				+"Doctor_Strange_%28No_Way_Home%29_profile_pic.jpg/revision/latest/"
				+ "top-crop/width/100/height/100?cb=20210906002003");
        Image image = ImageIO.read(url);
        return image;
	}

	public void setAvatar(String imageAvatar) {
		// TODO Auto-generated method stub	
	}
}

public class Main extends JFrame{	
	private Integer NIK = 202310028;
	private String Fullname = "Diva Lutfiando S";
	private String Address = "Jl Raya salabeda Perum Puri Kemang Asri Blok B.08/04, "
							+ "Bogor, Jawa Barat 161310";
	private String ImageAvatar = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/e/e0/"
			+"Doctor_Strange_%28No_Way_Home%29_profile_pic.jpg/revision/latest/"
			+ "top-crop/width/100/height/100?cb=20210906002003";
	
	public static void main(String[] args) {
		int positionX = 20;
		int positionY = 130;
		
		Main frame = new Main();
        frame.setSize(480,180);
        frame.setTitle("User Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().setLayout(null);
        
        Profile myprofile = new Profile();
        myprofile.setNIK(frame.NIK);
        myprofile.setFullname(frame.Fullname);
        myprofile.setAddress(frame.Address);
        myprofile.setAvatar(frame.ImageAvatar);        
        
        JLabel labelImage = new JLabel();
        try {
			Image avatar = myprofile.fetchingAvatar();
			labelImage = new JLabel(new ImageIcon(avatar));
		} catch (IOException e) {
			labelImage.setText("Failed load image");
			e.printStackTrace();
		}
        labelImage.setBounds(20, 20, 100, 100);
        frame.getContentPane().add(labelImage);
        
        JLabel labelNIK = new JLabel();
        labelNIK.setText("NIK: "+myprofile.getNIK());
        labelNIK.setBounds(positionY, positionX, 150, 14);
        frame.getContentPane().add(labelNIK);
        
        positionX = positionX  + 20;
        JLabel labelFullname = new JLabel();
        labelFullname.setText("Name: "+myprofile.getFullname());
        labelFullname.setBounds(positionY, positionX, 450, 14);
        frame.getContentPane().add(labelFullname);
        
        positionX = positionX  + 20;
        JLabel labelAddress= new JLabel();
        labelAddress.setText("Address:");
        labelAddress.setBounds(positionY, positionX, 300, 14);
        frame.getContentPane().add(labelAddress);
        
        positionX = positionX  + 15;
        JLabel textAddress= new JLabel();
        textAddress.setText("<html>"+myprofile.getAddress()+"</html>");
        textAddress.setBounds(positionY, positionX, 300, 50);
        frame.getContentPane().add(textAddress);
        frame.setVisible(true);        
        
	}
}