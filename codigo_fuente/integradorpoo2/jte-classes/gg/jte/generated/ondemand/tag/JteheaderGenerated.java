package gg.jte.generated.ondemand.tag;
public final class JteheaderGenerated {
	public static final String JTE_NAME = "tag/header.jte";
	public static final int[] JTE_LINE_INFO = {32,32,32,32,32,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<html lang=\"es\">\n\n    <head>\n        <meta charset=\"UTF-8\">\n        <title>Revisiones</title>\n        <link rel=\"stylesheet\" href=\"/bootstrap/css/bootstrap.min.css\">\n    </head>\n\n    <body>\n    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n      <div class=\"container-fluid\">\n        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarTogglerDemo03\" aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n          <span class=\"navbar-toggler-icon\"></span>\n        </button>\n        <a class=\"navbar-brand\" href=\"/\">Inicio</a>\n        <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n          <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n            <li class=\"nav-item\">\n              <a class=\"nav-link active\" aria-current=\"page\" href=\"/nueva-categoria\">Crear Categoria</a>\n            </li>\n            <li class=\"nav-item\">\n              <a class=\"nav-link active\" aria-current=\"page\" href=\"/crear-anuncio\">Crear Anuncio</a>\n            </li>\n            <li class=\"nav-item\">\n              <a class=\"nav-link active\" aria-current=\"page\" href=\"/categorias\">Categorias</a>\n            </li>\n            <li class=\"nav-item\">\n              <a class=\"nav-link active\" aria-current=\"page\" href=\"/registro-empresa\">Empresa</a>\n            </li>\n          </ul>\n        </div>\n      </div>\n    </nav>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
