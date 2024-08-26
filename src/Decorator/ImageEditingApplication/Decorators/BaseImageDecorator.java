package Decorator.ImageEditingApplication.Decorators;

import Decorator.ImageEditingApplication.ImageEditor;
import Decorator.ImageEditingApplication.RawImageEditor;
import Decorator.ImageEditingApplication.Utils.Image;
import Decorator.ImageEditingApplication.Utils.ImageUtils;

public class BaseImageDecorator implements ImageEditor {
    public ImageEditor nextEdit;

    public BaseImageDecorator(ImageEditor nextEdit) {
        this.nextEdit = nextEdit;
    }

    @Override
    public Image render(String path) {
        return ImageUtils.read(path);
    }
}
