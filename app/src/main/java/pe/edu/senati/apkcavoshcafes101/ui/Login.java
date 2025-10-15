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
import pe.edu.senati.apkcavoshcafes101.databinding.FragmentLoginBinding;

public class Login extends Fragment {
    FragmentLoginBinding binding;
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
        binding = FragmentLoginBinding.inflate(inflater,container,false);
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController( view );

        binding.tvOlvidastes.setOnClickListener( v -> navController.navigate( R.id.navigation_olvidastes ) );
        binding.tvRegistrar.setOnClickListener( v -> navController.navigate( R.id.navigation_registrar ) );
        binding.btnRegistrar.setOnClickListener( v -> navController.navigate( R.id.navigation_registrar ) );
        binding.btnLogin.setOnClickListener( v -> btnLogin_Click() );
    }

    private void btnLogin_Click() {

    }

}