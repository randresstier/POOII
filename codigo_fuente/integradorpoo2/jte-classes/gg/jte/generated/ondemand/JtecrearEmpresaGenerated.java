package gg.jte.generated.ondemand;
public final class JtecrearEmpresaGenerated {
	public static final String JTE_NAME = "crearEmpresa.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,3,3,3,43,43,44,44,44,44,44,44,44,44,44,44,45,45,59,59,60};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.tulabor.tulabor.paginas.ModeloCategorias modelo) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n<form action=\"/empresa/guardar-empresa\" method=\"post\" class=\"row g-3 needs-validation\" novalidate>\n    <div class=\"col-md-3\">\n        <label for=\"nombre\" class=\"form-label\">Nombre Empresa</label>\n        <input type=\"text\" class=\"form-control\" id=\"nombre\" value=\"\" required name=\"empresa\">\n        <div class=\"valid-feedback\">\n        ok!\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"correo\" class=\"form-label\">Email</label>\n        <input type=\"email\" class=\"form-control\" id=\"correo\" placeholder=\"name@example.com\" name=\"correo\">\n        <div class=\"invalid-feedback\">\n            Please select.\n        </div>\n    </div>\n    <div class=\"col-md-3\">\n        <label for=\"empleados\" class=\"form-label\">Cantidad Empleados</label>\n        <select class=\"form-select\" id=\"empleados\" required name=\"empleados\">\n        <option selected value=\"1-10\">1-10</option>\n        <option  value=\"10-50\">10-50</option>\n        <option  value=\"50-10\">50-100</option>\n        <option  value=\"+100\">+100</option>\n        </select>\n        <div class=\"invalid-feedback\">\n        Please select.\n        </div>\n    </div>\n    \n    <div class=\"col-md-3\">\n        <label for=\"descripcion\" class=\"form-label\">Descripción Empresa</label>\n        <input type=\"text\" class=\"form-control\" id=\"descripcion\" value=\"\" required name=\"descripcion\">\n        <div class=\"valid-feedback\">\n        ok!\n        </div>\n    </div>\n\n    <div class=\"col-md-3\">\n        <label for=\"categoria\" class=\"form-label\">Categoría</label>\n        <select class=\"form-select\" id=\"categoria\" required name=\"categoria\">\n        ");
		for (var categoria : modelo.categorias) {
			jteOutput.writeContent("\n        <option");
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(categoria.getId())) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(categoria.getId());
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(categoria.getNombre());
			jteOutput.writeContent("</option>\n        ");
		}
		jteOutput.writeContent("\n        </select>\n        <div class=\"invalid-feedback\">\n            Please select.\n        </div>\n\n    </div>\n    <button type=\"submit\" class=\"btn btn-primary\"> Guardar </button>\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\n</form>\n\n\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.tulabor.tulabor.paginas.ModeloCategorias modelo = (com.tulabor.tulabor.paginas.ModeloCategorias)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
