package gg.jte.generated.ondemand;
public final class JtepublicacionesGenerated {
	public static final String JTE_NAME = "publicaciones.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,2,23,23,25,25,25,26,26,26,27,27,27,28,28,28,29,29,29,30,30,30,31,31,31,32,32,32,36,36,46,46};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.tulabor.tulabor.paginas.ModeloPublicaciones modelo) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.tag.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n\n    <h2> Publicaciones </h2>\n    <div class=\"table-responsive\">\n        <table class=\"table table-hover table-striped\">\n            <thead>\n                <tr>\n                    <th scope=\"col\">#</th>\n                    <th scope=\"col\">Título</th>\n                    <th class=\"col-1\" scope=\"col\">Descripción</th>\n                    <th class=\"col-1\" scope=\"col\">Fecha Limite</th>\n                    <th class=\"col-1\" scope=\"col\">Sueldo</th>\n                    <th class=\"col-1\" scope=\"col\">Modalidad</th>\n                    <th class=\"col-1\" scope=\"col\">Empresa</th>\n                    <th class=\"col-1\" scope=\"col\">Categoría</th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                    <th class=\"col-1\" scope=\"col\"> </th>\n                </tr>\n            </thead>\n\n            <tbody>\n                ");
		for (var c : modelo.publicaciones) {
			jteOutput.writeContent("\n                    <tr>\n                        <td scope=\"row\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getId());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getTitulo());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getDescripcion());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getFechaLimite());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getSueldo());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getModalidad());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getEmpresa().getNombre());
			jteOutput.writeContent("</td>\n                        <td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(c.getCategoria().getNombre());
			jteOutput.writeContent("</td>\n                        <td class=\"col-1\"> <a type=\"button\" class=\"btn btn-info no-gutters\" href=\"/\"> Editar </a></td>                            \n                        <td class=\"col-1\"> <button type=\"button\" class=\"btn btn-danger no-gutters\" onClick=\"\"> Eliminar </button></td>\n                    </tr>\n                ");
		}
		jteOutput.writeContent("\n            </tbody>\n\n        </table>\n    </div>\n\n\n<script src=\"/js/empresas.js\"></script>\n\n\n");
		gg.jte.generated.ondemand.tag.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.tulabor.tulabor.paginas.ModeloPublicaciones modelo = (com.tulabor.tulabor.paginas.ModeloPublicaciones)params.get("modelo");
		render(jteOutput, jteHtmlInterceptor, modelo);
	}
}
