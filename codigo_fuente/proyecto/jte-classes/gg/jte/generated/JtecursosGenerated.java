package gg.jte.generated;
public final class JtecursosGenerated {
	public static final String JTE_NAME = "cursos.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,19,19,21,21,21,22,22,22,23,23,23,24,24,24,25,25,25,27,27,37,37};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, edu.unam.jte.paginas.ModeloCursos modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <h2> Cursos </h2>\n    <a href=\"/\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\n    <div class=\"table-responsive\">\n        <table class=\"table table-hover table-striped\">\n            <thead>\n                <tr>\n                    <th scope=\"col\">#</th>\n                    <th scope=\"col\">Nombre</th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                </tr>\n            </thead>\n\n            <tbody>\n                ");
		for (var curso : modelo.cursos) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(curso.getId());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(curso.getNombre());
			jteOutput.writeContent("</td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info no-gutters\" href=\"cursos/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(curso.getId());
			jteOutput.writeContent("\"> Editar </a></td>                            \n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"borrar(");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(curso.getId());
			jteOutput.writeContent(")\"> Eliminar </button></td>\n                        <td class=\"col-1\"> <a href=\"/cursos/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(curso.getId());
			jteOutput.writeContent("/revisiones\" type=\"button\" class=\"btn btn-secondary\"> Revisiones </a> </td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent("\n            </tbody>\n\n        </table>\n    </div>\n\n\n<script src=\"/js/cursos.js\"></script>\n\n\n");
		gg.jte.generated.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		edu.unam.jte.paginas.ModeloCursos modelo = (edu.unam.jte.paginas.ModeloCursos)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
