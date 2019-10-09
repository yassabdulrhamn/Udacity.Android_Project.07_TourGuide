package com.example.ranyass.tourguide;


import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;

    ArrayList<String> placesNames;
    ArrayList<Integer> placesPics;
    ArrayList<String> placesMobile;
    ArrayList<String> placesDesc;
    ArrayList<String> placesLocations;
    ArrayList<String> placesPet;
    ArrayList<String> placesSmoking;

    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String tabName) {
        this.context = context;
        inflter = (LayoutInflater.from(applicationContext));

        switch (tabName)
        {
            case "Sightseeing":
                placesNames = new ArrayList<>();
                placesNames.add("Eiffel Tower");
                placesNames.add("Notre Dame");
                placesNames.add("Louvre Museum");
                placesNames.add("Holy Chapel");
                placesNames.add("Arc de Triomphe");

                placesPics = new ArrayList<>();
                placesPics.add(R.drawable.eiffeltower);
                placesPics.add(R.drawable.rete);
                placesPics.add(R.drawable.jkds);
                placesPics.add(R.drawable.chap);
                placesPics.add(R.drawable.arc);

                placesMobile = new ArrayList<>();
                placesMobile.add("+33 892 70 12 39");
                placesMobile.add("+1 574-631-5000");
                placesMobile.add("+75-345-345-3845");
                placesMobile.add("+75-345-345-3845");
                placesMobile.add("+75-345-345-3845");

                placesLocations = new ArrayList<>();
                placesLocations.add("Quai Branly, Trocadéro/Tour Eiffel, Paris ");
                placesLocations.add("Pl. du Parvis, Paris ");
                placesLocations.add("Palais du Louvre, Louvre/Tuileries, Paris ");
                placesLocations.add("4 bd. du Palais, Paris ");
                placesLocations.add("Pl. Charles-de-Gaulle, Champs-Élysées, Paris ");

                placesPet = new ArrayList<>();
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");

                placesSmoking = new ArrayList<>();
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");

                placesDesc = new ArrayList<>();
                placesDesc.add("The Eiffel Tower, one of the must sees in Paris, can't be missed from any spot while walking around in the city. It was built by the French engineer Gustave Eiffel which was already famous at the time for building bridges. He spent several years building the Eiffel Tower as a monument for the World Exhibition in 1889. Although today,");
                placesDesc.add("Many Parisians and tourists alike consider this place to be one of Paris top 10 attractions alongside the Holy Chapel, the Eiffel Tower, The Louvre Museum and others. The Notre Dame Cathedral (Paris), the most visited site in Paris (10 million tourists each year)");
                placesDesc.add("At the top of Paris top 10 attractions, The Louvre Museum (Paris) is in fact the largest art museum in the world and the home for one of the finest art collections anywhere to be seen including two of the most famous painted woman - the Mona Lisa and Venus de Milo just ...");
                placesDesc.add("The Holy Chapel (Paris) in French - La Sainte Chapelle, was built by King Louis IX to host the remains of the True Cross, including the original Crown of Thorns which was purchased from the emperor of Constantinople. Today the Holy Chapel Paris is considered among the ... ");
                placesDesc.add("One of the most popular attractions in Paris, Inspired by Rome's Arch of Titus, the Arc de Triomphe is located in Paris in the world’s largest traffic roundabout and is the biggest and tallest triumphal arch in the world - about 49 meters (161 ft.) high and 44 meters ...");

                break;
            case "Restaurants":

                placesNames = new ArrayList<>();
                placesNames.add("Disneyland Paris");
                placesNames.add("Parc Asterix");
                placesNames.add("Air and Space Museum");
                placesNames.add("The Tuileries Funfair");
                placesNames.add("Tropical glasshouse ");

                placesPics = new ArrayList<>();
                placesPics.add(R.drawable.fone);
                placesPics.add(R.drawable.ftwo);
                placesPics.add(R.drawable.fthree);
                placesPics.add(R.drawable.ffure);
                placesPics.add(R.drawable.ffive);

                placesMobile = new ArrayList<>();
                placesMobile.add("+33 1 53 67 19 90");
                placesMobile.add("+33 1 58 36 12 50");
                placesMobile.add("+33 1 44 05 06 05");
                placesMobile.add("+33 1 42 25 00 39");
                placesMobile.add("+33 1 44 31 98 00");

                placesLocations = new ArrayList<>();
                placesLocations.add("10 Avenue d'Iéna, 75116 Paris, France.");
                placesLocations.add("6 Rue Balzac, 75008 Paris, France.");
                placesLocations.add("5 Rue Mesnil, 75016 Paris, France.");
                placesLocations.add("4 bd. du Palais, Paris ");
                placesLocations.add("31 Avenue George V, 75008 Paris, France");

                placesPet = new ArrayList<>();
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");

                placesSmoking = new ArrayList<>();
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");

                placesDesc = new ArrayList<>();
                placesDesc.add("Many people come to Disneyland with their kids. This is a great idea. While you are in the city, discover the other top attractions that will thrill you and your kids: Parc Asterix, the other world class amusement park.");
                placesDesc.add("The city has two world class amusement parks. The best known is Disneyland, the only Disney park in Europe. You could stay there a few days and visit the city from there.");
                placesDesc.add("In the city, visit the Grevin Wax Museum, the equivalent of Madame Tussauds in London. A little bit expensive compared to many other museums in the city, Grevin is funny with its magic tricks and deforming mirrors.");
                placesDesc.add("Board a Seine river cruise. Use the funny Hop-on Hop-off double-deckers tours to see the city and her main sights. Walk up the stairs with your kids to the second floor of the Eiffel Tower. A stimulating experience that is quite feasible.");
                placesDesc.add("The renovated Paris Zoo is one of the best zoos in the world. Close to the city, go to Thoiry Safari Paris, a safari experience in the park of a beautiful French castle.");

                break;
            case "kids":
                placesNames = new ArrayList<>();
                placesNames.add("L'Abeille");
                placesNames.add("Pierre Gagnaire");
                placesNames.add("Le Petit Retro");
                placesNames.add("LAURENT DUCHÊNE.");
                placesNames.add("Le V");

                placesPics = new ArrayList<>();
                placesPics.add(R.drawable.kone);
                placesPics.add(R.drawable.ktwo);
                placesPics.add(R.drawable.kthree);
                placesPics.add(R.drawable.kfour);
                placesPics.add(R.drawable.kfive);

                placesMobile = new ArrayList<>();
                placesMobile.add("+33 1 53 67 19 90");
                placesMobile.add("+33 1 58 36 12 50");
                placesMobile.add("+33 1 44 05 06 05");
                placesMobile.add("+33 1 42 25 00 39");
                placesMobile.add("+33 1 44 31 98 00");

                placesLocations = new ArrayList<>();
                placesLocations.add("10 Avenue d'Iéna, 75116 Paris, France.");
                placesLocations.add("6 Rue Balzac, 75008 Paris, France.");
                placesLocations.add("5 Rue Mesnil, 75016 Paris, France.");
                placesLocations.add("4 bd. du Palais, Paris ");
                placesLocations.add("31 Avenue George V, 75008 Paris, France");

                placesPet = new ArrayList<>();
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");

                placesSmoking = new ArrayList<>();
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");

                placesDesc = new ArrayList<>();
                placesDesc.add("Chef Christophe Moret, fresh from Alain Ducasse's Plaza Athénée, has found his own, more relaxed gastronomic style now he heads up the restaurant of the Shangri-La hotel. L'Abeille");
                placesDesc.add("A discovery trail of French cuisine from one of the most inventive chefs around today, who often finds inspiration in painting and jazz. The pared-back dining room provides the stage for a panoply of dishes, from minuscule appetisers – a tuna meringue; a clam with diced veg – to a whirlwind of desserts.");
                placesDesc.add("Seemingly unchanged since 1904, with its flowery tiles and vintage coffee machine on the bar, this pretty little bistro was recently given a new injection of life by former TV journalist Grégory Poirier and his wife. They've kept the deliberately old-fashioned dishes.");
                placesDesc.add("A haunt of politicians and power brokers for its proximity to the Elysée Palace and perfect, discreet service. You might also see the occasional rock star. This is one of the nicest places to eat outdoors in Paris, with its well-spaced tables set in gardens on the lower reaches of the Champs-Elysées.");
                placesDesc.add("With a stained-glass verrière by Gustave Eiffel and two long curved banquettes that create an oval dining room, the mood is pleasantly casual rather than off-puttingly formal, as is the case with some hotel restaurants. The cooking is perfectly serious though: langoustine carpaccio.");

                break;

            case "Malls":
                placesNames = new ArrayList<>();
                placesNames.add("Les Galeries LaFayette");
                placesNames.add("Le Bon Marché");
                placesNames.add("Beaugrenelle");
                placesNames.add("Le Printemps Haussmann");
                placesNames.add("Forum des Halles");

                placesPics = new ArrayList<>();
                placesPics.add(R.drawable.mall1);
                placesPics.add(R.drawable.mall2);
                placesPics.add(R.drawable.mall3);
                placesPics.add(R.drawable.mall4);
                placesPics.add(R.drawable.mall5);

                placesMobile = new ArrayList<>();
                placesMobile.add("+33 1 53 67 19 90");
                placesMobile.add("+33 1 58 36 12 50");
                placesMobile.add("+33 1 44 05 06 05");
                placesMobile.add("+33 1 42 25 00 39");
                placesMobile.add("+33 1 44 31 98 00");

                placesLocations = new ArrayList<>();
                placesLocations.add("10 Avenue d'Iéna, 75116 Paris, France.");
                placesLocations.add("6 Rue Balzac, 75008 Paris, France.");
                placesLocations.add("5 Rue Mesnil, 75016 Paris, France.");
                placesLocations.add("4 bd. du Palais, Paris ");
                placesLocations.add("31 Avenue George V, 75008 Paris, France");

                placesPet = new ArrayList<>();
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");
                placesPet.add("Allowed");

                placesSmoking = new ArrayList<>();
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");
                placesSmoking.add("Allowed");

                placesDesc = new ArrayList<>();
                placesDesc.add("It’s 300m away from the Opéra Garnier that you can find one of the world’s most famous place to go shopping! Did you guess? Of course I am speaking about Galeries LaFayette of Boulevard Haussmann. This place is also known for its events trade and for its Christmas enlightenment.");
                placesDesc.add("Le Carrousel du Louvre is a place located under the Carrousel Garden, right next to the Comédie-Française, the Musée d’Orsay and the Musée du Louvre. It is simultaneously a commercial center, a catering place but also a cultural space.");
                placesDesc.add("Located in the center of Paris, not far away from the Opéra Garnier, the Printemps Haussmann center, is one of the main luxury shopping center of Paris. Frontages and roofs (except for the modern increased height) of the old shops are classified Historical Monuments.");
                placesDesc.add("Beaugrenelle is a shopping mall divided into three blocks. The first is the Magnetic block which gathers mainly top range fashion shops like Aigle, Michael Kors, Zadig & Voltaire or even Hollister. It is accompanied with high chains shops like H&M, Celio or even Zara. Follow by luxury beauty shops like Agatha or even Guerlain, it’s the paradise for fashionistas.");
                placesDesc.add("With a stained-glass verrière by Gustave Eiffel and two long curved banquettes that create an oval dining room, the mood is pleasantly casual rather than off-puttingly formal, as is the case with some hotel restaurants. The cooking is perfectly serious though: langoustine carpaccio.");

                break;
        }
    }

    @Override
    public int getCount() {
        return placesNames.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.item_listview, null);
        TextView texPlaceName =  view.findViewById(R.id.texPlaceName);
        TextView texPlaceDesc =  view.findViewById(R.id.texPlaceDesc);
        TextView texPlaceMobile =  view.findViewById(R.id.texPlaceMobile);
        TextView texPets =  view.findViewById(R.id.texPets);
        TextView texSmoking =  view.findViewById(R.id.texSmoking);
        TextView texPlaceLoaction =  view.findViewById(R.id.texPlaceLoaction);
        texPlaceLoaction.setMovementMethod(LinkMovementMethod.getInstance());
        ImageView imgPlacePic =  view.findViewById(R.id.imgPlacePic);

        texPlaceName.setText(placesNames.get(i));
        texPlaceDesc.setText(placesDesc.get(i));
        texPlaceMobile.setText(placesMobile.get(i));
        texPets.setText(placesPet.get(i));
        texSmoking.setText(placesSmoking.get(i));
        texPlaceLoaction.setText(placesLocations.get(i));
        imgPlacePic.setImageResource(placesPics.get(i));
        return view;
    }


}