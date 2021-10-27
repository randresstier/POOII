package gg.jte.generated;
public final class JteeditarCursoGenerated {
	public static final String JTE_NAME = "editarCurso.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,6,6,6,7,7,7,11,11};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, edu.unam.jte.paginas.ModeloCurso modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n<h2> Datos del curso </h2>\n\n<p> Curso ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.curso.getId());
		jteOutput.writeContent("</p>\n<p> Nombre ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.curso.getNombre());
		jteOutput.writeContent("</p>\n\n<a href=\"/cursos\" type=\"button\" class=\"btn btn-secondary\"> Volver </a>\n\n");
		gg.jte.generated.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		edu.unam.jte.paginas.ModeloCurso modelo = (edu.unam.jte.paginas.ModeloCurso)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
