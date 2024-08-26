package Decorator.ImageEditingApplication.Decorators;

import Decorator.ImageEditingApplication.ImageEditor;
import Decorator.ImageEditingApplication.Utils.Image;
import Decorator.ImageEditingApplication.Utils.ImageUtils;

public class SharpenImageDecorator extends BaseImageDecorator {

    public SharpenImageDecorator(ImageEditor imageEditor){
        super(imageEditor);
    }
    @Override
    public Image render(String path) {
        Image image = nextEdit.render(path);
        return ImageUtils.sharpImage(image);
    }
}
