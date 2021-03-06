package task16.task1631;

import task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imgType)throws IllegalArgumentException{
        if(imgType == ImageTypes.JPG){
            return new JpgReader();
        } else if(imgType == ImageTypes.BMP){
            return new BmpReader();
        } else if(imgType == ImageTypes.PNG){
            return new PngReader();
        } else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
