package task16.task1631;

import task16.task1631.common.ImageReader;
import task16.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
        ImageReader reader1 = ImageReaderFactory.getImageReader(ImageTypes.BMP);
        ImageReader reader2 = ImageReaderFactory.getImageReader(ImageTypes.PNG);
//        ImageReader reader3 = ImageReaderFactory.getImageReader(ImageTypes.SAS);
    }
}
