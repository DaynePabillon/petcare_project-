
import React from 'react';
import { useNavigate } from 'react-router-dom'; 
import { Button } from '@mui/material';

function HomeCard({text, urlImage}) {
  return (<div
            className="hover-card"
            style={{
              backgroundImage: 'url("{urlImage}")',
              backgroundSize: 'cover',
              backgroundPosition: 'center',
              borderRadius: '10px',
              width: '400px',
              height: '300px',
              position: 'relative',
              cursor: 'pointer'
            }}
          >
             

            <div style={{
              position: 'absolute',
              bottom: '20px',
              left: '200px',
              color: 'black',
              padding: '20px',
              borderRadius: '10px'
            }}>
              <h3>{text}</h3>
              
              
               <CustomButton variant="contained" sx={{padding: '10px', margin: '1rem'}} onClick={() => navigate('/veterinarians')}>Veterinarian</CustomButton>
            </div>
          </div>);
}

export default HomeCard;