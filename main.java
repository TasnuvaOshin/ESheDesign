<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#fcfff9"
    tools:context=".HomePage.HomeFragment"

    >

    <LinearLayout

        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:orientation="vertical"

        >

        <androidx.appcompat.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="15dp"
            android:background="@color/colorPrimary"
            android:elevation="16dp"
            android:minHeight="?attr/actionBarSize"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
            app:popupTheme="@style/AppTheme">

            <ImageButton
                android:id="@+id/ib_open"
                android:layout_width="60dp"
                android:layout_height="50dp"
                android:background="@android:color/transparent"
                android:src="@drawable/ic_format_list_bulleted_black_24dp"


                />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:fontFamily="sans-serif-condensed"
                android:text="E-She"
                android:textAlignment="center"
                android:textColor="@android:color/white"
                android:textSize="22sp"
                android:textStyle="bold" />


        </androidx.appcompat.widget.Toolbar>


        <LinearLayout

            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:gravity="center"
            android:orientation="vertical"
            android:padding="8dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="15dp"
                android:gravity="center"
                android:orientation="horizontal"
                android:paddingTop="6dp">

                <androidx.cardview.widget.CardView
                    android:layout_width="150dp"
                    android:layout_height="120dp"
                    android:layout_marginStart="15dp"
                    android:layout_marginLeft="15dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginRight="8dp"
                    android:layout_marginBottom="8dp"
                    android:padding="6dp"
                    app:cardBackgroundColor="@color/colorPrimary"

                    app:cardCornerRadius="12dp"
                    app:cardElevation="8dp">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">


                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="90dp"
                            android:paddingTop="8dp"
                            android:paddingBottom="6dp"
                            android:src="@drawable/tailor" />

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_alignParentBottom="true"
                            android:fontFamily="sans-serif-condensed"
                            android:paddingBottom="8dp"
                            android:text="E-Tailor"
                            android:textAlignment="center"
                            android:textColor="@android:color/white"
                            android:textStyle="bold" />

                    </RelativeLayout>
                </androidx.cardview.widget.CardView>


                <androidx.cardview.widget.CardView
                    android:layout_width="150dp"
                    android:layout_height="120dp"
                    android:layout_marginStart="15dp"
                    android:layout_marginLeft="15dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginRight="8dp"
                    android:layout_marginBottom="8dp"
                    android:padding="6dp"
                    app:cardBackgroundColor="@color/colorPrimary"

                    app:cardCornerRadius="12dp"
                    app:cardElevation="8dp">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">

                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="90dp"
                            android:paddingTop="8dp"
                            android:paddingBottom="6dp"
                            android:src="@drawable/parlor" />

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_alignParentBottom="true"
                            android:fontFamily="sans-serif-condensed"
                            android:paddingBottom="8dp"
                            android:text="E-Parlour"
                            android:textAlignment="center"
                            android:textColor="@android:color/white"
                            android:textStyle="bold" />

                    </RelativeLayout>
                </androidx.cardview.widget.CardView>


            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:gravity="center"
                android:orientation="horizontal"
                android:paddingTop="6dp">

                <androidx.cardview.widget.CardView
                    android:layout_width="150dp"
                    android:layout_height="120dp"
                    android:layout_marginStart="15dp"
                    android:layout_marginLeft="15dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginRight="8dp"
                    android:layout_marginBottom="8dp"
                    android:padding="6dp"
                    app:cardBackgroundColor="@color/colorPrimary"

                    app:cardCornerRadius="12dp"
                    app:cardElevation="8dp">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">

                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="90dp"
                            android:paddingTop="8dp"
                            android:paddingBottom="6dp"
                            android:src="@drawable/cosmetics" />

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_alignParentBottom="true"
                            android:fontFamily="sans-serif-condensed"
                            android:paddingBottom="8dp"
                            android:text="E-Cosmetics"
                            android:textAlignment="center"
                            android:textColor="@android:color/white"
                            android:textStyle="bold" />

                    </RelativeLayout>
                </androidx.cardview.widget.CardView>


                <androidx.cardview.widget.CardView
                    android:layout_width="150dp"
                    android:layout_height="120dp"
                    android:layout_marginStart="15dp"
                    android:layout_marginLeft="15dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginRight="8dp"
                    android:layout_marginBottom="8dp"
                    android:padding="6dp"
                    app:cardBackgroundColor="@color/colorPrimary"

                    app:cardCornerRadius="12dp"
                    app:cardElevation="8dp">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">

                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="90dp"
                            android:paddingTop="8dp"
                            android:paddingBottom="6dp"
                            android:src="@drawable/shop" />

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_alignParentBottom="true"
                            android:fontFamily="sans-serif-condensed"
                            android:paddingBottom="8dp"
                            android:text="E-Shop"
                            android:textAlignment="center"
                            android:textColor="@android:color/white"
                            android:textStyle="bold" />

                    </RelativeLayout>
                </androidx.cardview.widget.CardView>


            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:gravity="center"
                android:orientation="horizontal"
                android:paddingTop="6dp">

                <androidx.cardview.widget.CardView
                    android:layout_width="150dp"
                    android:layout_height="120dp"
                    android:layout_marginStart="15dp"
                    android:layout_marginLeft="15dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginRight="8dp"
                    android:layout_marginBottom="8dp"
                    android:padding="6dp"
                    app:cardBackgroundColor="@color/colorPrimary"

                    app:cardCornerRadius="12dp"
                    app:cardElevation="8dp">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">

                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="90dp"
                            android:paddingTop="8dp"
                            android:paddingBottom="6dp"
                            android:src="@drawable/pharmacy" />

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_alignParentBottom="true"
                            android:fontFamily="sans-serif-condensed"
                            android:paddingBottom="6dp"
                            android:text="E-Pharmacy"
                            android:textAlignment="center"
                            android:textColor="@android:color/white"
                            android:textStyle="bold" />

                    </RelativeLayout>
                </androidx.cardview.widget.CardView>


                <androidx.cardview.widget.CardView
                    android:layout_width="150dp"
                    android:layout_height="120dp"
                    android:layout_marginStart="15dp"
                    android:layout_marginLeft="15dp"
                    android:layout_marginEnd="8dp"
                    android:layout_marginRight="8dp"
                    android:layout_marginBottom="8dp"
                    android:padding="6dp"
                    app:cardBackgroundColor="@color/colorPrimary"

                    app:cardCornerRadius="12dp"
                    app:cardElevation="8dp">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">

                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="90dp"
                            android:paddingTop="8dp"
                            android:paddingBottom="6dp"
                            android:src="@drawable/power" />

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_alignParentBottom="true"
                            android:fontFamily="sans-serif-condensed"
                            android:paddingBottom="6dp"
                            android:text="E-Power"
                            android:textAlignment="center"
                            android:textColor="@android:color/white"
                            android:textStyle="bold" />

                    </RelativeLayout>
                </androidx.cardview.widget.CardView>


            </LinearLayout>

        </LinearLayout>
    </LinearLayout>
</RelativeLayout>
