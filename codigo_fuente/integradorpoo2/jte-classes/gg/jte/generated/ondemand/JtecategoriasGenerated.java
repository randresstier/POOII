package gg.jte.generated.ondemand;
public final class JtecategoriasGenerated {
	public static final String JTE_NAME = "categorias.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,18,18,20,20,20,21,21,21,22,22,22,23,23,23,25,25,35,35};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.tulabor.tulabor.paginas.ModeloCategorias modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <h2> Categorias </h2>\n    <div class=\"table-responsive\">\n        <table class=\"table table-hover table-striped\">\n            <thead>\n                <tr>\n                    <th scope=\"col\">#</th>\n                    <th scope=\"col\">Nombre</th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                </tr>\n            </thead>\n\n            <tbody>\n                ");
		for (var categoria : modelo.categorias) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(categoria.getId());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(categoria.getNombre());
			jteOutput.writeContent("</td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info no-gutters\" href=\"categorias/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(categoria.getId());
			jteOutput.writeContent("\"> Editar </a></td>                            \n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(categoria.getId());
			jteOutput.writeContent(")\"> Eliminar </button></td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent("\n            </tbody>\n\n        </table>\n    </div>\n\n\n<script src=\"/js/categorias.js\"></script>\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.tulabor.tulabor.paginas.ModeloCategorias modelo = (com.tulabor.tulabor.paginas.ModeloCategorias)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
