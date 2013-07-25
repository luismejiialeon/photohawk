package at.ac.tuwien.photohawk.evaluation.operation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import at.ac.tuwien.photohawk.evaluation.colorconverter.ColorConverter;
import at.ac.tuwien.photohawk.evaluation.colorconverter.srgb.SRGBStaticColor;

public class ColorCoverterHelper {
    /**
     * Creates an (incomplete) mock for a ColorConverter with 1 pixel.
     * 
     * @param values
     *            values of the pixel
     * @return the mocked color converter
     */
    public static ColorConverter<SRGBStaticColor> mockColorConverter(float[] values) {
        @SuppressWarnings("unchecked")
        ColorConverter<SRGBStaticColor> img = mock(ColorConverter.class);
        when(img.getNumberOfChannels()).thenReturn(values.length);
        when(img.getNullColor()).thenReturn(new SRGBStaticColor(0, 0, 0));
        when(img.getColorChannels(0, 0)).thenReturn(new SRGBStaticColor(values));
        return img;
    }
}