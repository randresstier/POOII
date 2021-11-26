package gg.jte.generated.ondemand;
public final class JtepublicacionGenerated {
	public static final String JTE_NAME = "publicacion.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,12,13,13,13,20,20};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.tulabor.tulabor.paginas.ModeloPublicacion modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n<h1 class=\"heading\">Detalle Publicación</h1>\n    <div class=\"article-loop\">\n      <h3>");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(modelo.publicacion.getTitulo());
		jteOutput.writeContent("</h3>\n      <p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getDescripcion());
		jteOutput.writeContent("</p>\n      <p>Fecha Limite: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getFechaLimite());
		jteOutput.writeContent("</p>\n      <p>Sueldo: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getSueldo());
		jteOutput.writeContent("</p>\n      <p>Modalidad: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getModalidad());
		jteOutput.writeContent("</p>\n      <p>Empresa: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getEmpresa().getNombre());
		jteOutput.writeContent("</p>\n      <p>Cantidad Empleados: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getEmpresa().getCantidadEmpleados());
		jteOutput.writeContent("</p>\n      <p>Categoría: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(modelo.publicacion.getCategoria().getNombre());
		jteOutput.writeContent("</p>\n      <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"location.href='/publicaciones/'\">Postular</button></td>\n    </div>\n\n<script src=\"/js/empresas.js\"></script>\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.tulabor.tulabor.paginas.ModeloPublicacion modelo = (com.tulabor.tulabor.paginas.ModeloPublicacion)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
