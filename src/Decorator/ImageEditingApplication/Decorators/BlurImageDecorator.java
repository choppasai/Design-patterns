package Decorator.ImageEditingApplication.Decorators;

import Decorator.ImageEditingApplication.ImageEditor;
import Decorator.ImageEditingApplication.Utils.Image;
import Decorator.ImageEditingApplication.Utils.ImageUtils;

public class BlurImageDecorator extends BaseImageDecorator {
    public BlurImageDecorator(ImageEditor nextEdit){
        super(nextEdit);

    }
    @Override
    public Image render(String path) {
        Image image = nextEdit.render(path);
        return ImageUtils.applyBlur(image);
    }
}
