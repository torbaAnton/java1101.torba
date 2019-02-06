package torba.java1101.oop.joanne_K_rowling_universe;

public class TestSpirit {
    public static void main(String[] args) {
        Spirit boggart = new Spirit();
        boggart.setName("Boggart");
        boggart.setDescription("Привидение, которое хочет всех напугать.");
        boggart.setTransparency(0.3f);
        boggart.setLocation("shelf");
        boggart.setIncorporeality(0.3f);
        boggart.setSex(Sex.IT);
        boggart.setTemperament(Temperament.SANGVINIK);
        Spirit bloodBaron = new Spirit();
        bloodBaron.setName("Blood Baron");
bloodBaron.setDescription("Факультетское привидение Слизерина (в приступе ярости заколол кинжалом любимую девушку," +
        " Елену Когтевран, и, осознав произошедшее, покончил жизнь самоубийством).");
bloodBaron.setTransparency(0.1f);
bloodBaron.setIncorporeality(0.0f);
bloodBaron.setLocation("Факультет Слизерин");
bloodBaron.setSex(Sex.MALE);
bloodBaron.setTemperament(Temperament.HOLERIK);
Spirit nicolas = new Spirit();
nicolas.setName("Almost Headless Nic");
nicolas.setDescription("Факультетское привидение Гриффиндора. Очень демократичное привидение." +
        " И к тому же харизматичен. Всегда готов прийти на помощь, по крайней мере — гриффиндорцам, позволяет ученикам называть себя просто «Ник»." + "\n"+
        " Но если вы задели его чувства, гордо вскидывает голову и холодно замечает, что зовут его «Сэр Николас де Мимси-Дельфингтон», и именно так к нему следует обращаться.");
nicolas.setTransparency(0.1f);
nicolas.setIncorporeality(0.0f);
nicolas.setLocation("Факультет Гриффиндор");
nicolas.setSex(Sex.MALE);
nicolas.setTemperament(Temperament.MELANHOLIK);
            Window app = new Window();
            app.setVisible(true);
        System.out.println(nicolas.toString()+bloodBaron.toString()+boggart.toString());
    }

}
