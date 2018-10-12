# SweetAlertDialog

This is the Sweet Alert Dialog Library.

# How to Integrate - 

1. Add this to Project level gardle file.

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. Add this to your App level gradle file.

```
	dependencies {
		implementation 'com.github.bibutikoley:SweetAlertDialog:1.0'
	}
```
  
 Thats it..

# How to use -
```
SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
pDialog.setTitleText("Loading");
pDialog.setCancelable(false);
pDialog.show();
```
