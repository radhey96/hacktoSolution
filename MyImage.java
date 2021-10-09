// Java program to demonstrate read and write of image
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage
{
	public static void main(String args[])throws IOException
	{
		int width = 963; //width of the image
		int height = 640; //height of the image

		// For storing image in RAM
		BufferedImage image = null;

		// READ IMAGE
		try
		{
			File input_file = new File("G:\\Inp.jpg"); //image file path

			image = new BufferedImage(width, height,
									BufferedImage.TYPE_INT_ARGB);

			// Reading input file
			image = ImageIO.read(input_file);

			System.out.println("Reading complete.");
		}
		catch(IOException e)
		{
			System.out.println("Error: "+e);
		}

		// WRITE IMAGE
		try
		{
			// Output file path
			File output_file = new File("G:\\Out.jpg");

			// Writing to file taking type and path as
			ImageIO.write(image, "jpg", output_file);

			System.out.println("Writing complete.");
		}
		catch(IOException e)
		{
			System.out.println("Error: "+e);
		}
	}
}
