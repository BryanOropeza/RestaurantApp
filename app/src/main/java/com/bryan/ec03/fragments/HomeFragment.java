package com.bryan.ec03.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bryan.ec03.databinding.FragmentHome2Binding;
import com.bryan.ec03.model.MainPlate;
import com.bryan.ec03.model.MenuModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHome2Binding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rcvPlatesMenu.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rcvPlatesMenu.setLayoutManager(layoutManager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHome2Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    private List<MenuModel> getData() {
        List<MenuModel> menu = new ArrayList<>();
        menu.add(new MainPlate("Ceviche de Pescado","https://comidaperuana.link/wp-content/uploads/2017/09/Ceviche-de-Pescado.jpg", "Delicioso Ceviche Fresco","1.- Pescado Fresco\n2.- Limón\n3.- Camote"));
        menu.add(new MainPlate("Arroz con Pollo","https://www.jamear.com/wp-content/uploads/2022/05/arrozconpollo-peruano.png", "Delicioso Arroz en su punto","1.- Pollo (cortado en presas)\\n2.- Ajo (picado)\\n3.- Cebolla (picada)\\n4.- Ají amarillo (sin venas ni pepas, picado)\\n5.- Comino\\n6.- Aceite vegetal\\n7.- Sal y pimienta al gusto\\n8.- Cilantro (picado)\\n9.- Culantro (picado)\\n10.- Arroz\\n11.- Cerveza (opcional, para marinar)\\n12.- Papa amarilla (pelada y cortada en trozos)\\n13.- Zanahoria (pelada y cortada en trozos)\\n14.- Choclo (maíz tierno, cortado en trozos)\\n15.- Guisantes (arvejas)\\n16.- Huevos (cocidos y cortados en mitades)\\n17.- Aceitunas (opcional, para decorar)"));
        menu.add(new MainPlate("Lomo Saltado","https://www.elolivar.com.pe/wp-content/uploads/2021/08/lomo-saltado.png", "Un Lomo Saltado esquisito","1.- Filete de res (cortado en tiras)\n2.- Cebolla (cortada en tiras)\n3.- Tomate (cortado en tiras)\n4.- Ají amarillo (cortado en tiras)\n5.- Ajo (picado)\n6.- Vinagre\n7.- Salsa de soja\n8.- Papas (cortadas en bastones)\n9.- Arroz cocido"));
        menu.add(new MainPlate("Escabeche","https://decomidaperuana.com/wp-content/uploads/2019/09/receta-de-escabeche-de-pollo.jpg", "Sabor inigualable como en casa","1.- Pescado fresco (generalmente cabrilla o similar)\n2.- Cebolla (en rodajas)\n3.- Ají amarillo (picado)\n4.- Ajo (picado)\n5.- Vinagre\n6.- Comino\n7.- Orégano\n8.- Papas cocidas (en rodajas)\n9.- Zanahorias cocidas (en rodajas)\n10.- Aceitunas negras\n11.- Huevos (cocidos y cortados en mitades)\n12.- Perejil (picado)"));
        menu.add(new MainPlate("Arroz Chaufa","https://www.cocinista.es/download/bancorecursos/recetas/receta-arroz-chaufa-peruano.jpg", "Plato típico Peruano","1.- Arroz cocido (preferiblemente frío)\n2.- Carne de cerdo, pollo o camarones (cortados en trozos)\n3.- Cebolla (picada)\n4.- Ají amarillo (picado)\n5.- Ajo (picado)\n6.- Huevo (revuelto y cocido)\n7.- Salsa de soja\n8.- Aceite vegetal\n9.- Pimiento morrón (cortado en tiras)\n10.- Guisantes (arvejas)\n11.- Zanahoria (en tiras)\n12.- Cebolla verde (picada)"));
        menu.add(new MainPlate("Causa Rellena","https://comidasdelperu.com/wp-content/uploads/2021/06/Receta-de-Causa-Rellena-Paso-a-paso-1.jpg", "Plato a base de Papa, pollo, y palta","1.- Papa amarilla (cocida y hecha puré)\n2.- Ají amarillo (licuado)\n3.- Limón\n4.- Aceite de ají amarillo\n5.- Atún en lata (escurrido)\n6.- Mayonesa\n7.- Palta (aguacate)\n8.- Cebolla roja (picada)\n9.- Limón\n10.- Sal y pimienta al gusto\n11.- Huevos (cocidos y cortados en mitades)\n12.- Aceitunas negras"));
        menu.add(new MainPlate("Ají de Gallina","https://decomidaperuana.com/wp-content/uploads/2017/09/receta-de-aji-de-gallina.jpg", "preparado con la mejor calidad","1.- Pollo desmenuzado\n2.- Ají amarillo (licuado)\n3.- Pan remojado en leche\n4.- Ajo (picado)\n5.- Cebolla (picada)\n6.- Galletas de soda\n7.- Queso parmesano (rallado)\n8.- Leche evaporada\n9.- Nueces (picadas)\n10.- Aceitunas negras\n11.- Huevos (cocidos y cortados en mitades)\n12.- Arroz blanco"));
        menu.add(new MainPlate("Juane","https://www.comidastipicasperuanas.com/wp-content/uploads/2023/05/Receta-de-juane-de-gallina-de-la-selva-Comidas-Peruanas.jpeg", "De la selva a tu hogar, un Juane como ninguno","1.- Arroz\n2.- Muslos de pollo (cocidos y desmenuzados)\n3.- Aceitunas negras\n4.- Huevos (cocidos y picados)\n5.- Cilantro (picado)\n6.- Comino\n7.- Ajo (picado)\n8.- Ají amarillo (licuado)\n9.- Hojas de bijao o plátano\n10.- Aceite vegetal\n11.- Cebolla (picada)"));
        menu.add(new MainPlate("Pachamanca","https://usil-blog.s3.amazonaws.com/PROD/blog/image/dia-pachamanca.jpg", "De los mejores platos de nuestra Zona Andina","1.- Carne de cerdo\n2.- Carne de res\n3.- Pollo\n4.- Cuy (opcional)\n5.- Papas\n6.- Camotes\n7.- Yuca\n8.- Mazamorra (maíz morado cocido)\n9.- Hierbas aromáticas\n10.- Hojas de plátano o bijao\n11.- Rocoto (ají picante)\n12.- Sal"));
        menu.add(new MainPlate("Sopa seca","https://comidasperuanas.net/wp-content/uploads/2023/02/Sopa-Seca.jpg", "Deliciosa sopa seca de calidad","1.- Fideos gruesos\n2.- Carne de res (cortada en trozos)\n3.- Cebolla (picada)\n4.- Ajo (picado)\n5.- Ají amarillo (licuado)\n6.- Comino\n7.- Papas (cortadas en cubos)\n8.- Caldo de res\n9.- Huevos (cocidos y picados)\n10.- Leche evaporada\n11.- Queso fresco (rallado)\n12.- Aceitunas negras"));
        return menu;
    }
}