package PaooGame.Graphics;

import java.awt.image.BufferedImage;

/*! \class public class Assets
    \brief Clasa incarca fiecare element grafic necesar jocului.

    Game assets include tot ce este folosit intr-un joc: imagini, sunete, harti etc.
 */
public class Assets
{
        /// Referinte catre elementele grafice (dale) utilizate in joc.
    public static BufferedImage playerLeft;
    public static BufferedImage playerRight;
    public static BufferedImage soil;
    public static BufferedImage grass;
    public static BufferedImage mountain;
    public static BufferedImage townGrass;
    public static BufferedImage townGrassDestroyed;
    public static BufferedImage townSoil;
    public static BufferedImage water;
    public static BufferedImage rockUp;
    public static BufferedImage rockDown;
    public static BufferedImage rockLeft;
    public static BufferedImage rockRight;
    public static BufferedImage tree;

    public static BufferedImage basement_colt;
    // public static BufferedImage basement_perete;
    public static BufferedImage basement;
    public static BufferedImage perete1;
    public static BufferedImage floorTile1;
    public static BufferedImage normalDoor;
    public static BufferedImage rock1;
    public static BufferedImage isaac1;
    public static BufferedImage monstro1;

    /*! \fn public static void Init()
        \brief Functia initializaza referintele catre elementele grafice utilizate.

        Aceasta functie poate fi rescrisa astfel incat elementele grafice incarcate/utilizate
        sa fie parametrizate. Din acest motiv referintele nu sunt finale.
     */
    public static void Init()
    {
            /// Se creaza temporar un obiect SpriteSheet initializat prin intermediul clasei ImageLoader
        //SpriteSheet sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/random/PaooGameSpriteSheet.png"));
        //SpriteSheet basement1=new SpriteSheet(ImageLoader.LoadImage("/textures/random/basementsprite1.png"));
            /// Se obtin subimaginile corespunzatoare elementelor necesare.
        /*grass = sheet.crop(0, 0);
        soil = sheet.crop(1, 0);
        water = sheet.crop(2, 0);
        mountain = sheet.crop(3, 0);
        townGrass = sheet.crop(0, 1);
        townGrassDestroyed = sheet.crop(1, 1);
        townSoil = sheet.crop(2, 1);
        tree = sheet.crop(3, 1);
        playerLeft = sheet.crop(0, 2);
        playerRight = sheet.crop(1, 2);
        rockUp = sheet.crop(2, 2);
        rockDown = sheet.crop(3, 2);
        rockLeft = sheet.crop(0, 3);
        rockRight = sheet.crop(1, 3);

        //basement = sheet.cropIm(0,0);
        perete1=basement1.crop(0,0);
        floorTile1=basement1.crop(1,0);
        normalDoor=basement1.crop(2,0);
        rock1=basement1.crop(4,0);
        isaac1=basement1.crop(0,1);
        monstro1=basement1.crop(1,1);*/
    }
}