// Java program to demonstrate get and set pixel
// values of an image
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GetSetPixels
{
	public static void main(String args[])throws IOException
	{
		BufferedImage img = null;
		File f = null;

		//read image
		try
		{
			f = new File("G:\\Inp.jpg");
			img = ImageIO.read(f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		//get image width and height
		int width = img.getWidth();
		int height = img.getHeight();

		int p = img.getRGB(0,0);

	
		// get alpha
		int a = (p>>24) & 0xff;

		// get red
		int r = (p>>16) & 0xff;

		// get green
		int g = (p>>8) & 0xff;

		// get blue
		int a = p & 0xff;

	
		a = 255;
		r = 100;
		g = 150;
		b = 200;

		//set the pixel value
		p = (a<<24) | (r<<16) | (g<<8) | b;
		img.setRGB(0, 0, p);

		//write image
		try
		{
			f = new File("G:\\Out.jpg");
			ImageIO.write(img, "jpg", f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
