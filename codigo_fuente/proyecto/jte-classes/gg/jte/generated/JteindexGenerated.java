package gg.jte.generated;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,4,4,5,5,5,17,17,25,25,28,28};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, edu.unam.jte.paginas.ModeloIndex modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n");
		if (!modelo.nombreUsuario.trim().isEmpty()) {
			jteOutput.writeContent(" \n    <h2><b> Hola ");
			jteOutput.setContext("b", null);
			jteOutput.writeUserContent(modelo.nombreUsuario);
			jteOutput.writeContent("! </b></h2>\n    <nav class=\"navbar navbar-dark navbar-expand-sm bg-primary\">\n\n        <ul class=\"navbar-nav\">\n            <li class=\"nav-item\">\n                <a class=\"navbar-brand\" href=\"/cursos\"> Ver cursos </a>\n            </li>\n            <li class=\"nav-item\">\n                <a class=\"navbar-brand\" href=\"/cursos/nuevo\"> Agregar curso </a>\n            </li>\n        </ul>\n    </nav>\n");
		} else {
			jteOutput.writeContent("        \n    <form action=\"/\" method=\"post\" onsubmit=\"return validarUsuario();\">\n        <div class=\"form-group row\">\n            <label class=\"col-sm-2 col-form-label\"> Usuario </label>\n            <input class=\"form-control col-sm-4\" type=\"text\" placeholder=\"nombre del usuario\" id=\"nombreUsuario\" name=\"nombreUsuario\"/>\n        </div>\n        <button class=\"btn btn-primary\"> Ingresar </button>\n    </form>\n");
		}
		jteOutput.writeContent("\n\n<script src=\"/js/validarUsuario.js\"></script>\n");
		gg.jte.generated.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		edu.unam.jte.paginas.ModeloIndex modelo = (edu.unam.jte.paginas.ModeloIndex)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
