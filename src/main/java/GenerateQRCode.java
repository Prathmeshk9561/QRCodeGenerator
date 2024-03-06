import java.io.IOException;
import java.nio.file.Paths;

import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class GenerateQRCode {

	public static void main(String[] args) throws WriterException, IOException {
		// TODO Auto-generated method stub
		
		String url = "https://prathmeshk9561.github.io/MyPortfolio/";
		String path = "/Users/Admin/Desktop/TechStack/portfolio.jpg";
		
		BitMatrix matrix  = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, 500, 500);
		MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
		System.out.println("QR Code Generated Successfully..!");
	}
}