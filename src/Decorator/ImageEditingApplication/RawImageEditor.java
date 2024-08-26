package Decorator.ImageEditingApplication;

import Decorator.ImageEditingApplication.Utils.Image;
import Decorator.ImageEditingApplication.Utils.ImageUtils;

public class RawImageEditor implements ImageEditor{
    @Override
    public Image render(String path) {
        return ImageUtils.read(path);
    }
}
