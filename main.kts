
import 'package:flutter/material.dart';

void main() {
    runApp(const LoginApp());
}

class LoginApp extends StatelessWidget {
    const LoginApp({super.key});

    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            title: 'Flutter Demo',
        theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
        ),
        home: const MyHomeLoginApp(title: 'Login de Acceso al Sistema'),
        );
    }
}

class MyHomeLoginApp extends StatefulWidget {
    const MyHomeLoginApp({super.key, required this.title});

    final String title;

    @override
    State<MyHomeLoginApp> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomeLoginApp> {

    @override
    Widget build(BuildContext context) {
        return Scaffold(
            appBar: AppBar(
                    backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
        ),
        body: Form(
        child: Column(
        children: <Widget> [
        SizedBox(height: 40,),
        TextFormField(
            decoration: InputDecoration(
                    labelText: 'Email:'
        ),
        ),
        TextFormField(
            obscureText: true, //Encriptar
        decoration: InputDecoration(
        labelText: 'Password:'
        ),
        ),
        Padding(
            padding: const EdgeInsets.symmetric(vertical: 80, horizontal: 120),
        child: ElevatedButton(
        onPressed:()
        {
        },
        child: Text('Entrar'),
        ),
        )
        ],
        ),
        )
        );
    }
}


