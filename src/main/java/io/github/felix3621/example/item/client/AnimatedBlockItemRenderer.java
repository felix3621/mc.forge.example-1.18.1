package io.github.felix3621.example.item.client;

import io.github.felix3621.example.item.custom.AnimatedBlockItem;
import io.github.felix3621.example.item.custom.AnimatedItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class AnimatedBlockItemRenderer extends GeoItemRenderer<AnimatedBlockItem> {
    public AnimatedBlockItemRenderer() {
        super(new AnimatedBlockItemModel());
    }
}
