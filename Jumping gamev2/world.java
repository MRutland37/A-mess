import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{

    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        floor floor = new floor();
        addObject(floor,31,392);
        floor.setLocation(25,387);
        floor floor2 = new floor();
        addObject(floor2,87,389);
        floor2.setLocation(72,387);
        floor floor3 = new floor();
        addObject(floor3,123,370);
        floor3.setLocation(118,387);
        floor floor4 = new floor();
        addObject(floor4,173,368);
        floor4.setLocation(167,387);
        floor floor5 = new floor();
        addObject(floor5,214,373);
        floor5.setLocation(217,387);
        floor floor6 = new floor();
        addObject(floor6,280,384);
        floor6.setLocation(265,387);
        floor floor7 = new floor();
        addObject(floor7,332,377);
        floor7.setLocation(314,387);
        floor floor8 = new floor();
        addObject(floor8,388,364);
        floor floor9 = new floor();
        addObject(floor9,455,367);
        floor floor10 = new floor();
        addObject(floor10,463,317);
        floor8.setLocation(364,387);
        floor9.setLocation(411,387);
        floor10.setLocation(459,387);
        floor floor11 = new floor();
        addObject(floor11,508,379);
        floor11.setLocation(509,387);
        floor floor12 = new floor();
        addObject(floor12,558,371);
        floor12.setLocation(559,387);
        floor floor13 = new floor();
        addObject(floor13,562,335);
        floor13.setLocation(581,387);
        platform platform = new platform();
        addObject(platform,28,240);
        platform.setLocation(25,240);
        platform platform2 = new platform();
        addObject(platform2,107,239);
        platform2.setLocation(74,240);
        platform platform3 = new platform();
        addObject(platform3,148,249);
        platform3.setLocation(124,240);
        platform platform4 = new platform();
        addObject(platform4,196,233);
        platform4.setLocation(173,240);
        platform platform5 = new platform();
        addObject(platform5,551,233);
        platform5.setLocation(223,240);
        platform platform6 = new platform();
        addObject(platform6,340,232);
        platform6.setLocation(275,240);
        platform platform7 = new platform();
        addObject(platform7,321,228);
        platform7.setLocation(326,240);
        platform platform8 = new platform();
        addObject(platform8,380,232);
        platform8.setLocation(377,215);
        platform8.setLocation(376,240);
        platform platform9 = new platform();
        addObject(platform9,431,229);
        platform9.setLocation(427,240);
        platform platform10 = new platform();
        addObject(platform10,491,237);
        platform10.setLocation(479,240);
        platform platform11 = new platform();
        addObject(platform11,534,228);
        platform11.setLocation(530,240);
        platform platform12 = new platform();
        addObject(platform12,586,243);
        platform12.setLocation(577,240);
        platform10.setLocation(455,315);
        platform9.setLocation(406,294);
        platform8.setLocation(343,310);
        platform7.setLocation(327,303);
        platform6.setLocation(267,318);
        platform5.setLocation(481,240);
        platform9.setLocation(432,240);
        platform8.setLocation(300,352);
        platform7.setLocation(411,314);
        platform6.setLocation(300,304);
        platform7.setLocation(170,109);
        platform10.setLocation(220,109);
        platform platform13 = new platform();
        addObject(platform13,280,114);
        platform platform14 = new platform();
        addObject(platform14,333,112);
        platform13.setLocation(270,109);
        platform14.setLocation(320,109);
        platform13.setLocation(370,109);
        platform14.setLocation(418,109);
        floor floor14 = new floor();
        addObject(floor14,533,146);
        floor floor15 = new floor();
        addObject(floor15,533,146);
        floor floor16 = new floor();
        addObject(floor16,533,146);
        floor floor17 = new floor();
        addObject(floor17,533,146);
        floor floor18 = new floor();
        addObject(floor18,533,146);
        floor floor19 = new floor();
        addObject(floor19,533,146);
        floor floor20 = new floor();
        addObject(floor20,533,146);
        floor floor21 = new floor();
        addObject(floor21,533,146);
        floor floor22 = new floor();
        addObject(floor22,533,146);
        floor floor23 = new floor();
        addObject(floor23,533,146);
        floor floor24 = new floor();
        addObject(floor24,533,146);
        floor floor25 = new floor();
        addObject(floor25,533,146);
        floor25.setLocation(578,215);
        floor floor26 = new floor();
        addObject(floor26,530,118);
        floor26.setLocation(528,215);
        floor24.setLocation(480,215);
        floor23.setLocation(432,215);
        floor22.setLocation(300,280);
        floor21.setLocation(173,214);
        floor20.setLocation(124,214);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(533,146);
        floor19.setLocation(76,214);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(533,146);
        floor18.setLocation(28,214);
        floor floor27 = new floor();
        addObject(floor27,13,215);
        floor27.setLocation(12,214);
        floor17.setLocation(169,85);
        floor16.setLocation(220,85);
        floor floor28 = new floor();
        addObject(floor28,197,85);
        floor15.setLocation(370,81);
        floor14.setLocation(418,81);
        Person person = new Person();
        addObject(person,490,319);
        Person2 person2 = new Person2();
        addObject(person2,127,311);
        floor21.setLocation(173,211);
        floor20.setLocation(124,211);
        floor19.setLocation(75,211);
        floor27.setLocation(15,211);
        floor18.setLocation(27,211);
        floor23.setLocation(431,212);
        floor24.setLocation(478,211);
        floor26.setLocation(526,210);
        floor24.setLocation(481,212);
        floor26.setLocation(531,212);
        floor25.setLocation(579,212);
        floor23.setLocation(431,208);
        floor24.setLocation(479,208);
        floor26.setLocation(528,208);
        floor25.setLocation(577,208);
        floor27.setLocation(13,208);
        floor19.setLocation(76,209);
        floor18.setLocation(33,208);
        floor19.setLocation(78,208);
        floor20.setLocation(124,208);
        floor21.setLocation(174,208);
        person.setLocation(483,349);
        person2.setLocation(128,350);
    }
}