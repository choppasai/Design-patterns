package Decorator.ImageEditingApplication;

import Decorator.ImageEditingApplication.Decorators.BaseImageDecorator;
import Decorator.ImageEditingApplication.Decorators.BlurImageDecorator;
import Decorator.ImageEditingApplication.Decorators.GrayscaleImageDecorator;
import Decorator.ImageEditingApplication.Utils.Image;

public class Client {
    public static void main(String[] args){
        ImageEditor image = new RawImageEditor();
        ImageEditor image1 = new BaseImageDecorator(image);
        ImageEditor image2 = new BlurImageDecorator(image1);
        ImageEditor image3 = new GrayscaleImageDecorator(image2);
        System.out.println(image3.render("path").getFilePath());
    }
}
