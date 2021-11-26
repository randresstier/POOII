package gg.jte.generated.ondemand;
public final class JtepublicacionesGenerated {
	public static final String JTE_NAME = "publicaciones.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,5,5,7,7,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,16,16,21,21};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.tulabor.tulabor.paginas.ModeloPublicaciones modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n<h1 class=\"heading\">Publicaciones</h1>\n    ");
		for (var c : modelo.publicaciones) {
			jteOutput.writeContent("\n        <div class=\"article-loop\">\n          <h3>");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(c.getTitulo());
			jteOutput.writeContent("</h3>\n          <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(c.getDescripcion());
			jteOutput.writeContent("</p>\n          <p>Fecha Limite: ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(c.getFechaLimite());
			jteOutput.writeContent("</p>\n          <p>Sueldo: ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(c.getSueldo());
			jteOutput.writeContent("</p>\n          <p>Modalidad: ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(c.getModalidad());
			jteOutput.writeContent("</p>\n          <p>Empresa: ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(c.getEmpresa().getNombre());
			jteOutput.writeContent("</p>\n          <p>Categoría: ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(c.getCategoria().getNombre());
			jteOutput.writeContent("</p>\n          <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"location.href='/publicaciones/");
			jteOutput.setContext("button", "onClick");
			jteOutput.writeUserContent(c.getId());
			jteOutput.writeContent("'\">Ver</button></td>\n        </div>\n    ");
		}
		jteOutput.writeContent("\n\n<script src=\"/js/empresas.js\"></script>\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.tulabor.tulabor.paginas.ModeloPublicaciones modelo = (com.tulabor.tulabor.paginas.ModeloPublicaciones)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
