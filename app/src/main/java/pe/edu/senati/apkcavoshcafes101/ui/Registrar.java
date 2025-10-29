package pe.edu.senati.apkcavoshcafes101.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.edu.senati.apkcavoshcafes101.R;
import pe.edu.senati.apkcavoshcafes101.databinding.FragmentRegistrarBinding;

public class Registrar extends Fragment {
    FragmentRegistrarBinding binding;
    Context context;
    View view;
    NavController navController;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistrarBinding.inflate(inflater,container,false);
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController( view );

        binding.btnRegistrar.setOnClickListener( v -> btnRegistrar_Click() );
    }

    private void btnRegistrar_Click() {
        String sCorreo = binding.tilCorreo.getEditText().getText().toString().trim();

        // api -> guardar nombres, correo y password,  enviar correo con código validación

        Bundle bundle = new Bundle();
        bundle.putString("validar", "registrar");
        bundle.putString("correo", sCorreo);
        navController.navigate( R.id.navigation_validar, bundle );
    }

}