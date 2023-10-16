import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class projetosrRato extends PApplet {

// FEITO POR: Caroline Stefany Bueno Davalos

// importação da biblioteca Minim

// VAR PARA FONTE
PFont fonte;
// criação do objeto principal do Minim
Minim minim;
// criação dos objetos musicais do tipo AudioPlayer
AudioPlayer musica_abertura, ratinho, eita, vish, meupatrao, rapaz, jesus, parabenspapai, boanoite, naoehpai, historias, istononecziste, pare, uepa, ihaa;

// criação das variaveis para armazenar as imagens
PImage i, irapazhq, iratinho, iratinhoaponta, ieita, ivish, imeupatrao, irapaz, iistononecziste, iistononeczisteclick, iparabenspapai, iboanoite, 
inaoehpai, ihistorias, ijesus, ipare, iuepa, iihaa, iratinhocruz, ibarraco;

public void setup() {
  
  fonte = createFont ("Agency FB Negrito", 50);
  
  // CARREGAR IMAGENS NAS VARIAVEIS CRIADAS 
  
  i = loadImage("fundosrato.jpg");
  
  
  
  ibarraco = loadImage("barraco.png");
  irapazhq = loadImage("rapazhq1.png");
  iistononeczisteclick = loadImage("istononeczisteclick.png");
  iratinhoaponta = loadImage("ratinho_aponta.png");
  iratinhocruz = loadImage("ratinhocruz.jpg");
 
  iratinho = loadImage("ratinho.png");
  ieita = loadImage("eita.png");
  ivish = loadImage("vish.png");
  imeupatrao = loadImage("meupatrao.png");
  irapaz = loadImage("rapaz.png");
  ijesus = loadImage("jesus.png");
  iparabenspapai = loadImage("parabenspapai.png");
  iboanoite = loadImage("boanoite.png");
  inaoehpai = loadImage("naoehpai.png");
  ihistorias = loadImage("historias.png");
  iistononecziste = loadImage("istononecziste.png");
  ipare = loadImage("pare.png");
  iuepa = loadImage("uepa.png");
  iihaa = loadImage("ihaa.png");
  
  
  
  
  // alocação de memória para o objeto miniM
  minim = new Minim(this);
 
  // associar e carregar música de fundo
  musica_abertura = minim.loadFile("musica_abertura.mp3");
  musica_abertura.rewind();
  musica_abertura.play();

  
   
  
  // associação dos arquivos de música dos botões com os objetos
  
  boanoite = minim.loadFile("boanoite.mp3"); 
  rapaz = minim.loadFile("rapaz.mp3");
  eita = minim.loadFile("eita.mp3");
  historias = minim.loadFile("historias.mp3");
  ihaa = minim.loadFile("ihaa.mp3");
  meupatrao = minim.loadFile("meupatrao.mp3");
  jesus = minim.loadFile("jesus.mp3");
  naoehpai = minim.loadFile("naoehpai.mp3");
  parabenspapai = minim.loadFile("parabenspapai.mp3");
  pare = minim.loadFile("pare.mp3");
  ratinho = minim.loadFile("ratinho.mp3");
  uepa= minim.loadFile("uepa.mp3");
  istononecziste = minim.loadFile("istononecziste.mp3");
  vish = minim.loadFile("vish.mp3");
}


public void draw() {
  // limpa a tela a cada loop
 image(i,0,0); 
 i.resize(1000,1000);
 
 // define nosso texto na tela
 
 //texto 1 cabeçalho;
 
  // define nosso texto na tela
  fill(102, 217, 255);
  textFont(fonte);
  textSize(40);
  text("Clique nos botões para tocar o efeito sonoro:", 20,40);
  
  // texto 2;
  
  fill(102, 217, 255);
  textFont(fonte);
  textSize(30);
  text("PRESSIONE QUALQUER TECLA PARA PAUSAR OU RODAR A MUSICA DE FUNDO!", 150,700);
  
  // definir um delay para as imagens q serão geradas na tela ao clicar nos botões
  delay(900);
  
  // COLUNAS DE BOTÕES:
  
  // coluna1
  image(iratinho, 30,80);
  iratinho.resize(237,68);
  
  image(irapaz, 270,80);
  irapaz.resize(237,68);
  
  image(ieita, 510,80);
  ieita.resize(237,68);
  
  image(imeupatrao, 750,80);
  imeupatrao.resize(237,68);
  
  
  // coluna2 //
  image(ihistorias, 140,180);
  ihistorias.resize(237,68);
  
  image(iihaa, 390,180);
  iihaa.resize(237,68);
  
  image(iboanoite, 640,180);
  iboanoite.resize(237,68);
  
  
  // coluna3 //
  image(ijesus, 30,300);
  ijesus.resize(237,68);
  
  image(inaoehpai, 750,300);
  inaoehpai.resize(237,68);
  
  
  // coluna4 //
  image(iparabenspapai, 270,720);
  iparabenspapai.resize(237,68);
  
  image(ipare, 510,720);
  ipare.resize(237,68);
 
  
  // coluna5 //
  image(ivish, 140,820);
  ivish.resize(237,68);
  
  image(iuepa, 390,820);
  iuepa.resize(237,68);
  
  image(iistononecziste, 640,820);
  iistononecziste.resize(237,68);
  
  

}


// DEFINIMOS UMA FUNÇÃO DO TECLADO PARA PAUSAR O SOM DE FUNDO
public void keyPressed()

{
  if (musica_abertura.isPlaying())
  {musica_abertura.pause();}
  
  else if (musica_abertura.position() == musica_abertura.length())
  {
    musica_abertura.rewind();
    musica_abertura.play();
  }
  else
  {musica_abertura.play();}
  
  
  
}

// caso o mouse seja pressionado nas faixas de angulos ref aos botoes
// chama a função específica
public void mousePressed(){
  
  
  // colunas de botoes tambem especificadas abaixo para maior compreensão do codigo
  
  /////////////////////////////////// COLUNA 1: ///////////////////////////////////////////
  if((mouseX>30)&&(mouseY>80)&&(mouseX<267)&&(mouseY<148))  {
    if (ratinho.isPlaying())
    {ratinho.pause();}
    
    else {float xa=random(900); float yb=(600); image(iratinhoaponta,xa,yb+1);
    ratinho.rewind(); ratinho.play();}
  }

  
  if((mouseX>270)&&(mouseY>80)&&(mouseX<507)&&(mouseY<148)) {
    if (rapaz.isPlaying())
    {rapaz.pause();}
    
    else {  float xa=random(900); float yb=(800); image(irapazhq,xa,yb+1);
    rapaz.rewind(); rapaz.play();}
  }
  
  
  
  if((mouseX>510)&&(mouseY>80)&&(mouseX<747)&&(mouseY<148)) {
    if (eita.isPlaying())
    {eita.pause();}
    
    else { float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    eita.rewind(); eita.play();}
  }
  
  
  
  if((mouseX>750)&&(mouseY>80)&&(mouseX<987)&&(mouseY<148)){
    if (meupatrao.isPlaying())
    {meupatrao.pause();}
    
    else { float xa=random(900); float yb=(600); image(iratinhoaponta,xa,yb+1);
    meupatrao.rewind(); meupatrao.play();}
  }
  
  
  //////////////////////////// COLUNA 2://///////////////////////////////////////////////////////
  if((mouseX>140)&&(mouseY>180)&&(mouseX<377)&&(mouseY<248)) {
    if (historias.isPlaying())
    {historias.pause();}
    
    else { float xa=random(900); float yb=(600); image(iratinhoaponta,xa,yb+1);
    historias.rewind(); historias.play();}
  }
  
  
  
  if((mouseX>390)&&(mouseY>180)&&(mouseX<627)&&(mouseY<248)) {
    if (ihaa.isPlaying())
    {ihaa.pause();}
    
    else { float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    ihaa.rewind(); ihaa.play();}
  }



  if((mouseX>640)&&(mouseY>180)&&(mouseX<877)&&(mouseY<248)) {
    if (boanoite.isPlaying())
    {boanoite.pause();}
    
    else { float xa=random(900); float yb=(600); image(iratinhoaponta,xa,yb+1);
    boanoite.rewind(); boanoite.play();}
  }
  
  
  
  //////////////////////////// COLUNA 3://///////////////////////////////////////////////////////
  if((mouseX>30)&&(mouseY>300)&&(mouseX<267)&&(mouseY<368)) {
    if (jesus.isPlaying())
    {jesus.pause();}
    
    else { float xa=random(800); float yb=random(800); image(iratinhocruz,xa,yb+1);
    jesus.rewind(); jesus.play();}
  }
  
  
  
  if((mouseX>750)&&(mouseY>300)&&(mouseX<987)&&(mouseY<368)) {
    if (naoehpai.isPlaying())
    {naoehpai.pause();}
    
    else {  float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    naoehpai.rewind(); naoehpai.play();}
  }



  //////////////////////////// COLUNA 4://///////////////////////////////////////////////////////
  if((mouseX>270)&&(mouseY>720)&&(mouseX<507)&&(mouseY<788))  {
    if (parabenspapai.isPlaying())
    {parabenspapai.pause();}
    
    else {  float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    parabenspapai.rewind(); parabenspapai.play();}
  }
  
  
  
  if((mouseX>510)&&(mouseY>720)&&(mouseX<747)&&(mouseY<788)) {
    if (pare.isPlaying())
    {pare.pause();}
    
    else {  float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    pare.rewind(); pare.play();}
  }
  
  
  
  //////////////////////////// COLUNA 5://///////////////////////////////////////////////////////
  if((mouseX>140)&&(mouseY>820)&&(mouseX<377)&&(mouseY<888)) {
    if (vish.isPlaying())
    {vish.pause();}
    
    else {  float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    vish.rewind(); vish.play();}
  }
  
  
  if((mouseX>390)&&(mouseY>820)&&(mouseX<627)&&(mouseY<888)) {
    if (uepa.isPlaying())
    {uepa.pause();}
    
    else {  float xa=random(600); float yb=(600); image(ibarraco,xa,yb+1);
    uepa.rewind(); uepa.play();}
  }
  
  
  if((mouseX>640)&&(mouseY>820)&&(mouseX<877)&&(mouseY<888)) {
    if (istononecziste.isPlaying())
    {istononecziste.pause();}
    
    else {  float xa=random(700); float yb=(700); image(iistononeczisteclick,xa,yb+1);
    istononecziste.rewind(); istononecziste.play();}
  }
  
// print da posição do mouse para fins de verificação   
  
  println("Mouse X:", mouseX);
  println("Mouse Y:", mouseY);
  

}


/////////////////////// END!!!!!!!!!!!!!!!!! ////////////////////////////////////////////////////////////////////////////////////
  public void settings() {  size(1000, 1000, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "projetosrRato" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
