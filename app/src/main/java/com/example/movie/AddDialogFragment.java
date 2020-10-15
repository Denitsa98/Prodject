package com.example.movie;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class AddDialogFragment extends DialogFragment implements View.OnClickListener
{
    private EditText name;
    private EditText gеnre;
    private EditText year;
    private EditText actor;
    private EditText image;
    private EditText resume;
    private Button add;
    AddMovieDialogListener listener;

    public AddDialogFragment()
    {
        // Required empty public constructor
    }

    public static AddDialogFragment newInstance()
    {
        return new AddDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        name = view.findViewById(R.id.editText);
        gеnre = view.findViewById(R.id.editText2);
        year = view.findViewById(R.id.editText3);
        actor = view.findViewById(R.id.editText4);
        image = view.findViewById(R.id.editText5);
        resume = view.findViewById(R.id.editText6);
        add = view.findViewById(R.id.button);
        add.setOnClickListener(this);

        // Фокуситане на курсора за писане върху еditText
        name.requestFocus();
        // Автоматично показване на клавиятурата
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        listener = (AddMovieDialogListener)context;
    }

    @Override
    public void onClick(View v){
        Movie movie = new Movie(name.getText().toString(), gеnre.getText().toString(), year.getText().toString(), actor.getText().toString(), resume.getText().toString(), image.getText().toString());
        listener.onFinishAddDialog(movie);
        dismiss();
    }
}
