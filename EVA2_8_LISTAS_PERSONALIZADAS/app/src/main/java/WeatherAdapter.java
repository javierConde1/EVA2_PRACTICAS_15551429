import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.javierconde.eva2_8_listas_personalizadas.Clima;
import com.example.javierconde.eva2_8_listas_personalizadas.R;

public class WeatherAdapter extends ArrayAdapter {
    Context cContext;
    int iLayout;
    Clima[] aCiudadesClima;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imageView;
        TextView lblCiudad, lblGrado, lblEstado;
        View vFila = convertView;
        if(vFila == null){// si es nulo no exitre la fila y hay que crearla
            //PARA CREAR NUESTRA VISTA USAMOS LAYOUTINFLATER
            LayoutInflater liVista = ((Activity)cContext).getLayoutInflater();
            vFila = liVista.inflate(iLayout, parent, false);
        }
        //vincular los widgets
        imageView = vFila.findViewById(R.id.imageView);
        lblCiudad = vFila.findViewById(R.id.lblCiudad);
        lblGrado = vFila.findViewById(R.id.lblGrado);
        lblEstado = vFila.findViewById(R.id.lblEstado);

        Clima cActual = aCiudadesClima[position];
        //LLENAR DATOS
        imageView.setImageResource(cActual.iImagen);
        lblCiudad.setText(cActual.sCiudad);
        lblEstado.setText(cActual.descripcion);
        lblGrado.setText(cActual.iTemperatura);
        return vFila;

    }

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        cContext = context;
        iLayout = resource;
        aCiudadesClima = (Clima[]) objects;
    }
}
