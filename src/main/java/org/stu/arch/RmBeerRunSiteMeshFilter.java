package org.stu.arch;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class RmBeerRunSiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder siteMeshFilterBuilder) {
        siteMeshFilterBuilder.addDecoratorPath("/*","/WEB-INF/jsp/decorators/default.jsp");
    }
}
