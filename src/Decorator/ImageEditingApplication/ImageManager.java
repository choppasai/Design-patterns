package Decorator.ImageEditingApplication;


import Decorator.ImageEditingApplication.Utils.Image;
import Decorator.ImageEditingApplication.Utils.ImageUtils;

public class ImageManager {

    public Image readImage(String filePath, boolean enableGrayscale, boolean enableBlur) {

        Image image = ImageUtils.read(filePath);
        if (enableGrayscale) {
            image = ImageUtils.convertToGrayscale(image);
        }

        if (enableBlur) {
            image = ImageUtils.applyBlur(image);
        }

        return image;
    }
}