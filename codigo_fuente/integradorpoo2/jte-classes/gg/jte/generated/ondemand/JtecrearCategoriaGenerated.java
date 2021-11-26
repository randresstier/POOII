package gg.jte.generated.ondemand;
public final class JtecrearCategoriaGenerated {
	public static final String JTE_NAME = "crearCategoria.jte";
	public static final int[] JTE_LINE_INFO = {2,2,2,2,2,2,2,16,16,17};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n<h2> Crear Categoría </h2>\n<form action=\"/admin/guardar-categoria\" method=\"post\">\n    <div class=\"form-group row\">\n        <label for=\"nombre\" class=\"col-sm-2 col-form-label\"> Nombre Categoría </label>\n        <div class=\"col-sm-8\">\n            <input class=\"form-control\" type=\"text\" placeholder=\"categoría\" name=\"nombre\"/>\n        </div>\n    </div>\n    <button type=\"submit\" class=\"btn btn-primary\"> Guardar </button>\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\n</form>\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
