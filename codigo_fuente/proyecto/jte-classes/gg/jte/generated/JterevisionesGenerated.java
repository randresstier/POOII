package gg.jte.generated;
public final class JterevisionesGenerated {
	public static final String JTE_NAME = "revisiones.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,3,3,3,5,5,5,7,7,7,22,22,24,24,24,25,25,25,26,26,26,27,27,27,29,29,34,34};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, edu.unam.jte.paginas.ModeloRevisiones modelo) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n<h2> Revisiones del curso ");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(modelo.cursoId);
		jteOutput.writeContent(" </h2>\n<a href=\"/cursos\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\n<a href=\"/cursos/");
		jteOutput.setContext("a", "href");
		jteOutput.writeUserContent(modelo.cursoId);
		jteOutput.writeContent("/revisiones/nuevo\" type=\"button\" class=\"btn btn-primary\"> Agregar </a>\n\n<div class=\"table-responsive\">\n    <table class=\"table table-hover table-striped\">\n        <thead>\n            <tr>\n                <th scope=\"col\">#</th>\n                <th scope=\"col\">Calificación</th>\n                <th scope=\"col\">Comentario</th>                            \n                <th scope=\"col\">Consejo</th>\n            </tr>\n        </thead>\n            \n        <tbody>\n\n            ");
		for (var revision : modelo.revisiones) {
			jteOutput.writeContent("\n                <tr>\n                    <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(revision.getId());
			jteOutput.writeContent("</td>\n                    <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(revision.getCalificacion());
			jteOutput.writeContent("</td>\n                    <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(revision.getComentario());
			jteOutput.writeContent("</td>\n                    <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(revision.getConsejo());
			jteOutput.writeContent("</td>\n                </tr>\n            ");
		}
		jteOutput.writeContent("\n        </tbody>\n    </table>\n</div>\n\n");
		gg.jte.generated.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		edu.unam.jte.paginas.ModeloRevisiones modelo = (edu.unam.jte.paginas.ModeloRevisiones)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
