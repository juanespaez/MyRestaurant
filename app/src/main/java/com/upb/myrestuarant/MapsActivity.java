package com.upb.myrestuarant;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.upb.myrestuarant.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in medellin and move the camera
        LatLng medellin = new LatLng(6.24, -75.60);
        mMap.addMarker(new MarkerOptions().position(medellin).title("Marker Medellin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin));



        LatLng laureles = new LatLng(6.24, -75.60);
        mMap.addMarker(new MarkerOptions().position(laureles).title("Sede principal"));

        LatLng centro = new LatLng(6.251277, -75.571565);
        mMap.addMarker(new MarkerOptions().position(centro).title("Sede candelaria"));

        LatLng poblado = new LatLng(6.203222, -75.558978);
        mMap.addMarker(new MarkerOptions().position(poblado).title("Sede sur"));

        LatLng norte = new LatLng(6.272973, -75.576471);
        mMap.addMarker(new MarkerOptions().position(norte).title("Sede norte"));
    }
}