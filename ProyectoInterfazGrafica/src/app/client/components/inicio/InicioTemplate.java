package app.client.components.inicio;

import app.client.components.accion.AccionComponent;
import app.client.components.accion.AccionTemplate;
import app.client.components.tarjeta.TarjetaComponent;

import app.services.graphicServices.ObjGraficosService;
import app.services.graphicServices.RecursosService;

import models.Accion;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicioTemplate extends JPanel {
  private static final long serialVersionUID = 1L;
  
  // Declaración Servicios y dependencias
  private InicioComponent inicioComponent;
  private ObjGraficosService sObjGraficos;
  private RecursosService sRecursos;

  // Declaración Objetos Gráficos
  private JPanel pTarjetas, pMision, pVision, pNosotros, pUsuarios, pDesarrollo, pGrupo, pAcciones;
  private JLabel lAcciones;
  private JButton bDerecha, bIzquierda;

  // Declaración Objetos Decoradores
  private ImageIcon iTarjeta1, iTarjeta2, iTarjeta3, iTarjeta4, iTarjeta5, iTarjeta6;
  private ImageIcon iDerecha, iIzquierda, iDimAux;

  public InicioTemplate(InicioComponent inicioComponent) {
    this.inicioComponent = inicioComponent;
    this.inicioComponent.getClass();
    sObjGraficos = ObjGraficosService.getService();
    sRecursos = RecursosService.getService();

    this.crearObjetosDecoradores();
    this.crearJButtons();
    this.crearJPanels();
    this.crearContenidoPMision();
    this.crearContenidoPVision();
    this.crearContenidoPNosotros();
    this.crearContenidoPUsuarios();
    this.crearContenidoPDesarrollo();
    this.crearContenidoPGrupo();
    this.crearContenidoPAcciones();

    this.setSize(850, 600);
    this.setBackground(sRecursos.getColorGrisClaro());
    this.setLayout(null);
    this.setVisible(true);
  }

  public void crearJPanels() {
    this.pTarjetas = sObjGraficos.construirJPanel(
      0, 0, 2000, 245, sRecursos.getColorTransparente(), null
    );
    this.add(pTarjetas);

    this.pMision = sObjGraficos.construirJPanel(20, 15, 256, 230, Color.WHITE, null);
    pTarjetas.add(pMision);

    this.pVision = sObjGraficos.construirJPanel(296, 15, 256, 230, Color.WHITE, null);
    pTarjetas.add(pVision);

    this.pNosotros = sObjGraficos.construirJPanel(572, 15, 256, 230, Color.WHITE, null);
    pTarjetas.add(pNosotros);

    this.pUsuarios = sObjGraficos.construirJPanel(848, 15, 256, 230, Color.WHITE, null);
    pTarjetas.add(pUsuarios);

    this.pDesarrollo = sObjGraficos.construirJPanel(1124, 15, 256, 230, Color.WHITE, null);
    pTarjetas.add(pDesarrollo);

    this.pGrupo = sObjGraficos.construirJPanel(1400, 15, 256, 230, Color.WHITE, null);
    pTarjetas.add(pGrupo);

    this.pAcciones = sObjGraficos.construirJPanel(20, 260, 810, 330, Color.WHITE, null);
    this.add(pAcciones);
  }

  public void crearObjetosDecoradores() {
    this.iTarjeta1 = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/tarjetas/tarjeta1.jpg"
    );
    this.iTarjeta2 = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/tarjetas/tarjeta2.jpg"
    );
    this.iTarjeta3 = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/tarjetas/tarjeta3.jpg"
    );
    this.iTarjeta4 = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/tarjetas/tarjeta4.jpg"
    );
    this.iTarjeta5 = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/tarjetas/tarjeta5.jpg"
    );
    this.iTarjeta6 = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/tarjetas/tarjeta6.jpg"
    );
    this.iDerecha = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/derecha.png"
    );

    this.iIzquierda = new ImageIcon(
      "ProyectoInterfazGrafica/resources/images/izquierda.png"
    );
  }

  public void crearJButtons() {
    iDimAux = new ImageIcon( iIzquierda.getImage()
      .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
    );

    bIzquierda = sObjGraficos.construirJButton(
      null,
      0, 125, 20, 20,
      sRecursos.getCMano(),
      iDimAux,
      null, null, null, null,
      "c",
      false
    );
    bIzquierda.addActionListener(inicioComponent);
    this.add(bIzquierda);

    iDimAux = new ImageIcon( iDerecha.getImage()
        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
    );

    bDerecha = sObjGraficos.construirJButton(
      null,
      830, 125, 20, 20,
      sRecursos.getCMano(),
      iDimAux,
      null, null, null, null,
      "c",
      false
    );
    bDerecha.addActionListener(inicioComponent);
    this.add(bDerecha);
  }

  public void crearContenidoPMision() {
    this.pMision.add( 
      new TarjetaComponent(
        "Nuestra Misión",
        iTarjeta1,
        "Ofrecer al cliente un servicio profesional" +
        "Fidelizarnos con nuestros clientes."
      ).getTarjetaTemplate()
    );
  }

  public void crearContenidoPVision() {
    this.pVision.add(
      new TarjetaComponent(
        "Nuestra Visión",
        iTarjeta2,
        "Posicionarnos a Nivel nacional" +
        "Tener las mejores maquinas de entrenamiento"
      ).getTarjetaTemplate()
    );
  }

  public void crearContenidoPNosotros() {
    this.pNosotros.add(
      new TarjetaComponent(
        "Sobre Nosotros",
        iTarjeta3,
        "Somos un Gymnasio especializado" +
        "Estamos ubicados en Nicaragua"
      ).getTarjetaTemplate()
    );
  }

  public void crearContenidoPUsuarios() {
    this.pUsuarios.add(
      new TarjetaComponent(
        "Nuestros Usuarios",
        iTarjeta4,
        "Nuestros usuarios utilizan una app, para monitoriar su rendimiento en el GYM"
      ).getTarjetaTemplate()
    );
  }

  public void crearContenidoPDesarrollo() {
    this.pDesarrollo.add(
      new TarjetaComponent(
        "Desarrollo",
        iTarjeta5,
        "Nuestro Enfoque principal está en el entrenamiento fisico."
      ).getTarjetaTemplate()
    );
  }

  public void crearContenidoPGrupo() {
    this.pGrupo.add(
      new TarjetaComponent(
        "El grupo",
        iTarjeta6,
        "Nuestra comunidad y el aspecto social es lo mas importante."
      ).getTarjetaTemplate()
    );
  }

  public void crearContenidoPAcciones() {
    this.lAcciones = sObjGraficos.construirJLabel(
      "Nuestros Servicios",
      10, 10, 160, 30,
      null, null,
      sRecursos.getFontTitulo(),
      null,
      sRecursos.getColorPrincipal(),
      null,
      "c"
    );
    this.pAcciones.add(lAcciones);

    int numeroAccion = 0, fila = 0;
    Accion accion = inicioComponent.obtenerAccion(numeroAccion);
    while (accion != null) {
      AccionTemplate pAccion = 
        new AccionComponent(accion).getAccionTemplate();
      pAccion.setLocation(
        15 + ((pAccion.getWidth() + 15) * (numeroAccion % 3)),
        50 + ((pAccion.getHeight() + 15) * fila)
      );
      if (numeroAccion % 3 == 2) fila++;
      this.pAcciones.add(pAccion);
      numeroAccion++;
      accion = inicioComponent.obtenerAccion(numeroAccion);
    }
  }

  public JButton getBDerecha() { return bDerecha; }

  public JButton getBIzquierda() { return bIzquierda; }

  public JPanel getPTarjetas() { return pTarjetas; }
}