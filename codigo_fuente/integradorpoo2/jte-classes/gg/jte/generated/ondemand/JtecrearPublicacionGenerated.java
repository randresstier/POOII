package gg.jte.generated.ondemand;
public final class JtecrearPublicacionGenerated {
	public static final String JTE_NAME = "crearPublicacion.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,4,4,4,50,50,51,51,51,51,51,51,51,51,51,51,52,52,61,61,62,62,62,62,62,62,62,62,62,62,63,63,74,74};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.tulabor.tulabor.paginas.ModeloCategorias categoria, com.tulabor.tulabor.paginas.ModeloEmpresas empresa) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n<h2> Crear Publicación </h2>\n<form action=\"/empresa/guardar-publicacion\" method=\"post\">\n    <div class=\"col-md-3\">\n        <label for=\"titulo\" class=\"form-label\">Título</label>\n        <input type=\"text\" class=\"form-control\" id=\"titulo\" value=\"\" required name=\"titulo\">\n        <div class=\"valid-feedback\">\n            ok!\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"descripcion\" class=\"form-label\">descripcion</label>\n        <input type=\"text\" class=\"form-control\" id=\"descripcion\" value=\"\" required name=\"descripcion\">\n        <div class=\"valid-feedback\">\n            ok!\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"fechaLimite\" class=\"form-label\">Fecha Limite</label>\n        <input type=\"date\" name=\"fechaLimite\">\n        <div class=\"invalid-feedback\">\n            Please select.\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"modalidad\" class=\"form-label\">Modalidad</label>\n        <select class=\"form-select\" id=\"modalidad\" required name=\"modalidad\">\n            <option selected value=\"presencial\">Presencial</option>\n            <option value=\"remoto\">Remoto</option>\n            <option value=\"mixto\">Mixto</option>\n        </select>\n        <div class=\"invalid-feedback\">\n            Please select.\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"sueldo\" class=\"form-label\">Sueldo</label>\n        <input type=\"text\" class=\"form-control\" id=\"sueldo\" required name=\"sueldo\">\n        <div class=\"valid-feedback\">\n            ok!\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"categoria\" class=\"form-label\">Categoría</label>\n        <select class=\"form-select\" id=\"categoria\" required name=\"categoria\">\n            ");
		for (var c : categoria.categorias) {
			jteOutput.writeContent("\n            <option");
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(c.getId())) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(c.getId());
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(c.getNombre());
			jteOutput.writeContent("</option>\n            ");
		}
		jteOutput.writeContent("\n        </select>\n        <div class=\"invalid-feedback\">\n            Please select.\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"empresa\" class=\"form-label\">Empresa</label>\n        <select class=\"form-select\" id=\"empresa\" required name=\"empresa\">\n            ");
		for (var e : empresa.empresas) {
			jteOutput.writeContent("\n            <option");
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(e.getId())) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(e.getId());
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(e.getNombre());
			jteOutput.writeContent("</option>\n            ");
		}
		jteOutput.writeContent("\n        </select>\n        <div class=\"invalid-feedback\">\n            Please select.\n        </div>\n    </div>\n    <button type=\"submit\" class=\"btn btn-primary\"> Guardar </button>\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\n\n</form>\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.tulabor.tulabor.paginas.ModeloCategorias categoria = (com.tulabor.tulabor.paginas.ModeloCategorias)params.get("categoria");
		com.tulabor.tulabor.paginas.ModeloEmpresas empresa = (com.tulabor.tulabor.paginas.ModeloEmpresas)params.get("empresa");
		render(jteOutput, jteHtmlInterceptor, categoria, empresa);
	}
}
